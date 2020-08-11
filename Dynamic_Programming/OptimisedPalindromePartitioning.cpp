#include<bits/stdc++.h>
using namespace std;
int dp[1501][1501];
int paldp[1501][1501];
int isPalindrome(string s, int i, int j)
{
if (i >= j) return true;
if (paldp[i][j] != -1) return paldp[i][j];
if (s[i] == s[j]) return paldp[i][j] = isPalindrome(s, i + 1, j - 1);
return paldp[i][j] = false;
}

int getResult(string s, int i, int j)
{
if(i >= j)
return 0;
if(isPalindrome(s, i, j))
return dp[i][j] = 0;
if(dp[i][j] != -1)
return dp[i][j];
int ans = INT_MAX;
for(int k = i; k <= j; k++)
{
if(isPalindrome(s, i, k))
ans = min(ans, 1+getResult(s, i, k)+getResult(s, k+1, j));
}
dp[i][j] = ans;
return ans;
}
int main()
{
int t;
cin>>t;
while(t--)
{
memset(paldp, -1, sizeof(paldp));
memset(dp, -1, sizeof(dp));
string s;
cin>>s;
cout<<getResult(s, 0,s.size()-1)<<"\n";
}
return 0;
}