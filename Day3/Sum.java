class Sum {
    public static void main(String[] args) {
        int num = 1234;
        int r, sum;
        sum = 0;
        
        do {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }while(num > 0);
        System.out.println(sum);
        
    }
}