package FromBook;

public class Pet {
    public static void main(String[] args) {
        Mypet mypet = new Mypet();
        mypet.say("Hello again");
    }
}

class Mypet {

    public String say(String word){
        String secondWordr = "Hi, "+word;
        System.out.println(secondWordr);
        return secondWordr;
    }

}
