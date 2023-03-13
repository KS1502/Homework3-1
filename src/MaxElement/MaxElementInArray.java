package MaxElement;

public class MaxElementInArray {
   private int[] ints ;
   // private int[]max;

    public MaxElementInArray(int ints) {
        this.ints = new int[]{ints};
      //  this.max = new int[]{max};
    }

    public int[] getInts() {
        return ints;
    }

    public boolean setInts(int ints) {
      //for(int i=0;i<ints.length;i++);
      //int max = ints[0];
        if(ints<9) {
            this.ints = new int[]{ints};
        }else {
            System.out.println("Max element is not ");

    }

        return false;
    }
}

