import java.util.Arrays;

class Store{
    String[] feedbacks={};
    public void viewAllFeedbacks(){
        System.out.println(Arrays.toString(feedbacks));
    }
}

class JavaBatch extends Store{
    String expertName="";
    public JavaBatch(int size){
        feedbacks = new String[size];
    }
    public void addFeedBack(String comments){
        for(int index = 0; index<feedbacks.length; index++){
            if(feedbacks[index] == null || feedbacks[index]==""){
                feedbacks[index] = comments;
                System.out.println("Feedback noted");
                return;
            }
        }
        System.out.println("Buffer is full, can't add your feedback");
    }
}

class SoftskillBatch extends Store{
    public SoftskillBatch(){
        feedbacks = new String[]{"Training is good", "At the right pace", "New concepts everyday"};
    }
    public void read(int index){
        if(index<0 || index>=feedbacks.length)
            System.out.println("Invalid feedback");
        else
            System.out.println(feedbacks[index]);
    }
}

public class DemoInheritence {
    public static void main(String[] args) {
        JavaBatch javaBatch = new JavaBatch(4);
        javaBatch.expertName="ABC";
        javaBatch.addFeedBack("good");
        javaBatch.addFeedBack("Need more time to write code");
        javaBatch.addFeedBack("Array quite difficult");
        javaBatch.addFeedBack("Basics not done");
        //javaBatch.addFeedBack("expected foundation not advance");
        //Buffer is full, can't add your feedback - message
        javaBatch.viewAllFeedbacks();

        SoftskillBatch soft = new SoftskillBatch();
        soft.read(9);
        soft.viewAllFeedbacks();
    }
}
