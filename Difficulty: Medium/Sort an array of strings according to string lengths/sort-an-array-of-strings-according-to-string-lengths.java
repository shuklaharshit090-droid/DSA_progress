class Solution {
    public void sortByLength(String[] arr) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Comparator<String> com=new Comparator<String>(){
            public int compare(String i,String j){
                if(i.length()>j.length()){
                    return 1;
                }
                else if(i.length()<j.length()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        };
        Collections.sort(list,com);
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
    }
}
