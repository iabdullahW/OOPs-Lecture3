class exOverloading {
    int a, b;
    float c;

    // First variation (no parameters)
    void ex1() {
        System.out.println("first variation ");
    }

    // Second variation (accepts a float parameter)
    float ex1( float d) {
        System.out.println(d);
        return d;
    }
}

class ClassLecture3 {
    public static void main(String[] args) {
        // Create an instance of exOverloading
        exOverloading obj = new exOverloading();

        // Call the first variation (no parameter)
        obj.ex1();
        
        // Call the second variation (with a float parameter)
        obj.ex1(1.5f);  // Note the 'f' to indicate it's a float

    }
}