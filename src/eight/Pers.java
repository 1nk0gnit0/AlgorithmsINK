package eight;

import java.util.Objects;

public class Pers {
        private String name;

        public Pers(String name){
            this.name = name;
            System.out.println(name + " " + hashCode());
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pers person = (Pers) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

