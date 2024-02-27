package access;

public class Speaker {
    private int vol;

/*
    public Speaker(int vol) {
        this.vol = vol;
    }
*/

    void volUp(){
        if(vol >= 100){
            System.out.println("최고볼륨");
        }else{
            vol += 10;
            System.out.println("볼륨증가" +vol);
        }

    }
    void volDown(){
        vol -= 10;
        System.out.println("볼륨감소" +vol);

    }

}
