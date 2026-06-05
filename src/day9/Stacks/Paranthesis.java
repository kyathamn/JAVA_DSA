package day9.Stacks;
public class Paranthesis{
    public static void main(String[] args){

    Stack <Charecter> a=new Stack<> ();
        for(char ch:s.toCharArray){
            if(ch=='(' || ch=='[' || ch=='{')
            st.push(ch);
        }
        else{
            if(st.isEmpty()){
                return false;
            
        }
        char c=st.pop();
        if(ch==']' && c!='['){
            return false;
        }
        if(ch=='}' && c!='{'){
            return false;
        }
        }
        System.out.println(st);
        return true;
    }
}
        
    

