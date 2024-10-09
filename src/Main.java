//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.printf("Задача 1");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        //Задача 2
        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.printf("Задача 2");
        System.out.printf(" ");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.printf("Задача 3");
        System.out.printf(" ");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        //Задание 4
        var friend = 19;
        System.out.printf("Задача 4");
        System.out.printf(" ");
        System.out.println("friend="+friend);
        friend = friend * 2;
        System.out.println("friend="+friend);
        friend = friend / 7;
        System.out.println("friend="+friend);

        //Задание 5
        System.out.printf("Задача 5");
        System.out.printf(" ");
        var frog = 3.5;
        System.out.println("frog="+frog);
        frog = frog * 10;
        System.out.println("frog="+frog);
        frog = frog / 3.5;
        System.out.println("frog="+frog);
        frog = frog + 4;
        System.out.println("frog="+frog);

        //Задание 6
        var weight1 = 78.2;
        var weight2 = 82.7;
        var totalWeight = weight1 + weight2;
        System.out.printf("Задача 6");
        System.out.printf(" ");
        System.out.println("total weight is "+totalWeight);
        var weightDiff = weight2 - weight1;
        System.out.println("weight difference is "+weightDiff);

        //Задание 7
        var divRem = weight2 % weight1;
        System.out.printf("Задача 7");
        System.out.printf(" ");
        System.out.println("divRem ="+divRem);
    }
}