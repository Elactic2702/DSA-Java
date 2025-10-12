 class Phone {
    String brand_name;
    String id;
    int version;

    Phone(String brand_name,String id,int version){
        this.brand_name=brand_name;
        this.id=id;
        this.version=version;
    }

    void start(){
        System.out.println("Phone is starting");
    }

    void active(){
        System.out.println("Phone is active");
    }

    void stop(){
        System.out.println("Phone has stopped working");
    }

    public static void main(String[] args) {
        Phone p=new Phone("Apple","123a",14);
        Phone m=new Phone("SamsungGalaxy","456b",23);

        p.start();
        p.active();
        p.stop();

        m.start();
        m.stop();
        m.active();

        System.out.println("Brand name is: "+p.brand_name);
        System.out.println("ID Name is: "+p.id);

        System.out.println("Brand name is: "+m.brand_name);

    }
    
}
