package pgdp.register;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PenguinRegister {
    // Constants
    private static final char FIRST_CHAR = 'A', LAST_CHAR = 'Z';
    private static final int NUM_ALPHABET = LAST_CHAR - FIRST_CHAR + 1;

    private Penguin penguin = null;
    private PenguinRegister[] children = new PenguinRegister[NUM_ALPHABET];

    //Method to crete a tree with a penguin with certain name
    public PenguinRegister put(String name, Penguin penguin){
        int constant = 0;//Constant for the loop
        int i = 0;//This constants serve as index of the charAt of the name
        int j = 1;
        int k = 2;
        int l = 3;
        int m = 4;
        int n = 5;
        int o = 6;
        int p = 7;
        int q = 8;
        while (constant < name.length()){
            if(constant == 0 && this.children[name.charAt(i)-65]== null) {
                this.children[name.charAt(i) - 65] = new PenguinRegister();
                if (constant == name.length() - 1) {
                    this.children[name.charAt(i) - 65].penguin = penguin;
                    return this.children[name.charAt(i) - 65];
                }
            }
            else if(constant == 1 && this.children[name.charAt(i)-65].children[name.charAt(j)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65] = new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65];
                }
            }
            else if(constant == 2 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65]= new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65];
                }
            }
            else if(constant == 3 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65] = new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65];
                }
            }
            else if(constant == 4 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65] = new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65];
                }
            }
            else if(constant == 5 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65]= new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65];
                }
            }
            else if(constant == 6 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65]= new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65];
                }
            }
            else if(constant == 7 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65]== null){
                this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65]= new PenguinRegister();
                if (constant == name.length()-1){
                    this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65];
                }
            }
            else if(constant == 8 && this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].children[name.charAt(q)-65] == null) {
                this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65].children[name.charAt(q)-65] = new PenguinRegister();
                if (constant == name.length() - 1) {
                    this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65].children[name.charAt(q)-65].penguin = penguin;
                    return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65].children[name.charAt(q)-65];
                }
            }else{
                if(constant == 0){
                    if (constant == name.length() - 1) {
                        this.children[name.charAt(i) - 65].penguin = penguin;
                        return this.children[name.charAt(i) - 65];
                    }
                }
                else if(constant == 1){
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65];
                    }
                }
                else if(constant == 2) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65];
                    }
                }
                else if(constant == 3) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65];
                    }
                }
                else if(constant == 4) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65];
                    }
                }
                else if(constant == 5){
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65];
                    }
                }
                else if(constant == 6) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65];
                    }
                }
                else if(constant == 7) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65];
                    }
                }
                else if(constant == 8) {
                    if (constant == name.length()-1){
                        this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].children[name.charAt(q)-65].penguin = penguin;
                        return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].children[name.charAt(o) - 65].children[name.charAt(p) - 65].children[name.charAt(q)-65];
                    }
                }
            }
            constant++;
        }
        return null;
    }

    //More or less the same principle of the put method
    public Penguin get(String name){
        int constant = name.length();
        int i = 0;
        int j = 1;
        int k = 2;
        int l = 3;
        int m = 4;
        int n = 5;
        int o = 6;
        int p = 7;
        if(constant == 0 ) {
            return null;
        }
        if (this.children[name.charAt(i)-65] == null) {//Condition to see if this children exists
            return null;
        }
        if(constant == 1){
            if (this.children[name.charAt(i)-65].penguin != null){
                return this.children[name.charAt(i)-65].penguin;
            }else
                return null;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65] == null){
            return null;
        }
        if(constant == 2){
            if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].penguin != null){
                return this.children[name.charAt(i)-65].children[name.charAt(j)-65].penguin;
            }else
                return null;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65] == null){
            return null;
        }
        if(constant == 3) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].penguin != null) {
                return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].penguin;
            } else
                return null;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65] == null ){
            return null;
        }
        if(constant == 4) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].penguin != null) {
                return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].penguin;
            } else
                return null;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65] == null){
            return null;
        }
        if(constant == 5) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].penguin != null) {
                return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].penguin;
            } else
                return null;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65] == null){
            return null;
        }
        if(constant == 6 ) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].penguin != null) {
                return this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].penguin;
            } else
                return null;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65] == null){
            return null;
        }
        if(constant == 7){
            if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].penguin != null){
                return this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].penguin;
            }else
                return null;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65] == null) {
            return null;
        }
        if(constant == 8){
            if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].penguin != null){
                return this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].penguin;
            }else
                return null;
        }

    return null;}

    //Again the same idea as the put method,very similar to the get method
    public boolean contains (String name){
        int constant = name.length();
        int i = 0;
        int j = 1;
        int k = 2;
        int l = 3;
        int m = 4;
        int n = 5;
        int o = 6;
        int p = 7;
        if(constant == 0 ) {
            return false;
        }
        if (this.children[name.charAt(i)-65] == null) {
            return false;
        }
        if(constant == 1){
            if (this.children[name.charAt(i)-65].penguin != null){
                return true;
            }else
                return false;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65] == null){
            return false;
        }
        if(constant == 2){
            if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].penguin != null){
                return true;
            }else
                return false;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65] == null){
            return false;
        }
        if(constant == 3) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].penguin != null) {
                return true;
            } else
                return false;
        }
        if (this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65] == null ){
            return false;
        }
        if(constant == 4) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].penguin != null) {
                return true;
            } else
                return false;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65] == null){
            return false;
        }
        if(constant == 5) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].penguin != null) {
                return true;
            } else
                return false;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65] == null){
            return false;
        }
        if(constant == 6 ) {
            if (this.children[name.charAt(i) - 65].children[name.charAt(j) - 65].children[name.charAt(k) - 65].children[name.charAt(l) - 65].children[name.charAt(m) - 65].children[name.charAt(n) - 65].penguin != null) {
                return true;
            } else
                return false;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65] == null){
            return false;
        }
        if(constant == 7){
            if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].penguin != null){
                return true;
            }else
                return false;
        }
        if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65] == null){
            return false;
        }
        if(constant == 8){
            if(this.children[name.charAt(i)-65].children[name.charAt(j)-65].children[name.charAt(k)-65].children[name.charAt(l)-65].children[name.charAt(m)-65].children[name.charAt(n)-65].children[name.charAt(o)-65].children[name.charAt(p)-65].penguin != null){
                return true;
            }else
                return false;
        }

        return false;
    }

    public int size(){//Recursive method that finds the size of a tree
        PenguinRegister tree = this;
        int size = 0;
        if (tree.penguin != null){
            size++;
        }
        for (int num = 0; num < NUM_ALPHABET; num++) {
            if (tree.children[num] != null){
                size = size + tree.children[num].size();
            }
        }
        return size;
    }

    private String findNames(Penguin penguin){//Auxiliary method(recursive) to the findName method
        int j = 1;
        String name = "";
        for (int i = 0; i < NUM_ALPHABET && !name.contains(" "); i++,j++) {//The " " represents in the name if the name was found
            if (this.children[i] != null){
                if (this.children[i].penguin == penguin) {
                    return Character.toString(i+65)+" ";
                }else{
                    name =  Character.toString(i+65) + this.children[i].findNames(penguin);
                }
            }
            if (j == NUM_ALPHABET &&  name.length()>= 2){
                name = name.substring(0,name.length()-2);

            }
        }
        return name;
    }

    //Although finName is not recursive, the method findNames that actually find the names
    //is recursive.I wasn't able to return null for invalid penguins input in the other method
    //so i created this one.
    public String findName(Penguin penguin){
        if (findNames(penguin) == "" ){
            return null;
        }else
            return findNames(penguin).trim();//Adjust the name
    }


    public Penguin remove(String name){
            if(name.length() == 0){
                PenguinRegister removed = new PenguinRegister();
                if(this.penguin != null){
                    removed.penguin = this.penguin;
                    this.penguin = null;
                    return removed.penguin;
                }else{
                    return null;
                }
            }
            if (this.children[name.charAt(0)-65] == null){
                return null;
           }
        return this.children[name.charAt(0)-65].remove(name.substring(1));//Recursion that removes each letter each time
    }

    //private static final constants to help the following methods
    private static final EntryList list = new EntryList();
    private static final StringBuilder stringsName = new StringBuilder();

    private EntryList getAllHelp(){//Recursive auxiliary method
        int j = 1;
        for (int i = 0; i < NUM_ALPHABET ; i++,j++) {
            if (this.children[i] != null){
                if (this.children[i].penguin != null) {
                    stringsName.append(Character.toString(i+65));
                    list.add(new Entry(stringsName.toString(),this.children[i].penguin));
                    stringsName.deleteCharAt(stringsName.indexOf(Character.toString(i+65)));

                }else{
                    stringsName.append(Character.toString(i+65));
                    this.children[i].getAllHelp();
                }
            }
        }
        return list;
    }
    private EntryList check(EntryList list){//Method that checks the name and the description of the penguin
        for (int i = 0; i < list.size(); i++) {
            int until = list.get(i).getPenguin().getDescription().indexOf(" ");
            if(!list.get(i).getPenguin().getDescription().contains(list.get(i).getName())){
                if(!list.list.contains(list.get(i).getName())){
                    list.get(i).setName(list.get(i).getPenguin().getDescription().substring(0,until));
                }

            }
        }
        return list;
    }

    public EntryList getAll(){//Simply returns both auxiliary methods combined
        return check(getAllHelp());
    }

    public EntryList getAllWithPrefix(String prefix){//Method is not directly recursive, but calls a getAll that calls a recursive method
        EntryList result = getAll();
        EntryList finalResult = new EntryList();
        for (int i = 0; i < result.size()-1; i++) {
            if (result.get(i).getName().startsWith(prefix)){
                finalResult.add(result.get(i));
            }
        }
        return finalResult;
    }

    public EntryList getAllMatching(String pattern){//Similar idea as the getAllWithPrefix method
        EntryList result = getAll();
        EntryList finalResult = new EntryList();
        for (int i = 0; i < result.size()-1; i++) {
            if(result.get(i).getName().matches(pattern)){
                finalResult.add(result.get(i));
            }
        }
        return finalResult;
    }


    public static void main(String[] args) {
        PenguinRegister register = new PenguinRegister();

        Penguin ella, joe, jona;
        PenguinRegister joeSubtree;

        register.put("ED", new Penguin("ED is chilling"));
        register.put("ELLA", ella = new Penguin("ELLA wishes you merry christmas"));
        register.put("JR", new Penguin("JR as in junior"));
        joeSubtree = register.put("JOE", joe = new Penguin("JOE loves frozen fish"));
        register.put("JOEY", new Penguin("JOEY to the world ♬"));
        register.put("ELLIE", new Penguin("ELLIE loves her sister"));
        register.put("JOELY", new Penguin("JOELY eats some jelly"));
        register.put("ELY", new Penguin("ELY often gets mistook for her sister"));
        register.put("JA", new Penguin("JA sir"));
        register.put("JONA", new Penguin("JONA listens to music"));

        System.out.println(register.get("ELLA"));
        System.out.println(register.get("JOEY"));
        System.out.println(register.get("CAROL"));

        System.out.println(register.contains("ELLA"));
        System.out.println(register.contains("CAROL"));

        System.out.println(register.size());

        System.out.println(register.findName(ella));
        System.out.println(register.findName(joe));
        System.out.println(register.findName(new Penguin("JOE loves frozen fish"))); //impostor!

        jona = register.remove("JONA");
        System.out.println(ella == register.remove("ELLA") ? "ELLA has been removed" : "not removed?");
        System.out.println(register.size());

        register.put("ELLA", ella);
        register.put("JONA", jona);

        System.out.println(register.getAll());
        System.out.println(joeSubtree.getAll());

        System.out.println(register.getAllWithPrefix("JOE"));
        System.out.println(register.getAllWithPrefix("E"));

        System.out.println(register.getAllMatching(".O.."));
    }

}
