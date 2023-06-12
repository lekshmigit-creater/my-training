
public class Matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{3,4},{6,8}};
int b[][]= {{3,8},{6,9}};
int c[][]=new int[2][2];
int i,j;
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
c[i][j]=a[i][j]-b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}