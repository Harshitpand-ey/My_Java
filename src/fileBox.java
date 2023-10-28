public class fileBox {
    private int length;
    private int width;
    private int height;
   public fileBox(int length,int width,int height){
       this.length=length;
       this.width=width;
       this.height=height;
   }
   int volume(){
       return length*width*height;
   }
}

