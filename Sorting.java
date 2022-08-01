class Sorting{
public static void main(String args[])
{
int i,j;
int array[]={2,22,34,12,34};

for(i=0;i<array.length;i++)
{
for(j=0;j<array.length;j++)
{
if(array[i]<array[j])
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
}}}
for(i=0;i<array.length;i++)
System.out.println(array[i]);


}
}