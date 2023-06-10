class SortArray
{
public static void main(String args[])
{
int a[]={3,2,6,8,7},temp;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}