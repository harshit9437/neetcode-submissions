class Solution {
    public String mergeAlternately(String word1, String word2) {
    char[] arr1=word1.toCharArray();
    char[] arr2=word2.toCharArray();
    int i=0;
    int j=0;
  
    char[] arr=new char[arr1.length+arr2.length];
    int k=0;
        while(i<arr1.length && j<arr2.length){
            arr[k]=arr1[i];
            arr[k+1]=arr2[j];
            k=k+2;
            i++;
            j++;
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
            
        }
    String s=new String(arr);
    return s;
        
    }
}