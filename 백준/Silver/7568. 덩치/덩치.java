import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.rank = 1;
    }

    @Override
    public int compareTo(Person o) {
        if (this.weight < o.weight && this.height < o.height) {
            return -1;
        } else if (this.weight > o.weight && this.height > o.height) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();
            people.add(new Person(weight, height));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (people.get(i).compareTo(people.get(j)) == -1) {
                    people.get(i).rank++;
                }
            }
        }

        for (Person person : people) {
            System.out.print(person.rank + " ");
        }
    }
}
