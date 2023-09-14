package structural.facade.wikipedia.pc;

public class HardDrive {
    public char[] Read(long lba, int size) {
        System.out.println("lba: " + lba + ", size: " + size);

        char[] result = new char[5];
        result[0] = 'h';
        result[1] = 'e';
        result[2] = 'l';
        result[3] = 'l';
        result[4] = 'o';
        return result;
    }
}
