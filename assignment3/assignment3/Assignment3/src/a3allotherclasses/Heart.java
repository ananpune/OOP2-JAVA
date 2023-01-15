package a3allotherclasses;



public class Heart {
    private int bpm;
    private HeartBeat heartBeat;

    public Heart(int bpm, HeartBeat heartBeat){
        this.bpm=bpm;
        this.heartBeat=heartBeat;
    }
    
    public int getBPM(){
        return this.bpm;
    }
    public void setBPM(int newBPM){
        this.bpm = newBPM;
    }
    public void oneMinute(){
        for (int i=0; i<bpm; i++){
            System.out.print(this.heartBeat + " ");
        }
        System.out.print("\n");
    }
}
