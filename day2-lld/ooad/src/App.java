import com.sclr.lld.objects.Hen;
import com.sclr.lld.objects.Television;
import com.sclr.lld.objects.Eagle;
import com.sclr.lld.seller.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Hen whiteHen = new Hen("name1", "white", 1);
        System.out.println("Type of whiteHen :"+whiteHen.getClass().toGenericString());
        Hen blackHen = new Hen("name2", "black", 2);
        System.out.println("Type of blackHen :"+blackHen.getClass().toGenericString());
        Eagle indianEagle = new Eagle("indianEagle", "Brown", 5);
        System.out.println("Type of indianEagle :"+indianEagle.getClass().toGenericString());
        Seller s = new Seller();
        s.sell(whiteHen);
        s.sell(blackHen);
        s.sell(indianEagle);
        // s.sell(new Television());
    }
}
