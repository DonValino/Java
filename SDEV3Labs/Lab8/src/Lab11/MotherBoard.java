package Lab11;

/**
 * Created by x00112730 on 28/10/2014.
 */
public class MotherBoard {
    //Member Variables
    private String manufacturer;
    private int totalMemoryCapacity;
    private MemoryModule [] memoryModule;
    private static int mem1;

    //Constructor
    public MotherBoard(String manName,int tot,int [] mem)
    {
        manufacturer = manName;
        totalMemoryCapacity = tot;
        memoryModule = new MemoryModule[mem.length];
        for(int i = 0; i < mem.length; i++)
        {
            memoryModule[i] = new MemoryModule(mem[i]);
        }
        mem1 = mem.length;
    }
    //Static Method
    public static int getMem1()
    {
        return mem1;
    }

    //toString
    public String toString()
    {
        String content = "Motherboard manufacturer :" + manufacturer + " Containing";
        MemoryModule obb1 = new MemoryModule(totalMemoryCapacity / memoryModule.length);
        for(int i = 0; i < memoryModule.length;i++) {
           content += "\nModule " + (i+1) + " size : " + obb1.getmm();
        }
        return content;
    }




    //Inner Class
    class MemoryModule
    {
        //Member Variables
        private int memoryCapacity;

        //Constructor
        public MemoryModule(int memoryCapacity)
        {
            this.memoryCapacity = memoryCapacity;
        }

        //Getter
        public int getmm()
        {
            return memoryCapacity;
        }

        //toString
        public String toString()
        {
            return "Memory Capacity is :" + memoryCapacity;
        }
    }
}
