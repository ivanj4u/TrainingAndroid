package training.id.co.pegadaian.training.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import training.id.co.pegadaian.training.domain.History;

/**
 * Created by ivan_j4u on 4/12/2016.
 */
public class HistoryDao {

    public static List<History> getHistory() {
        List<History> list = new ArrayList<History>();

        for (int i = 0; i < 5; i++) {
            History hist = new History();
            hist.setNamaNasabah("Nasabah 0" + i);
            hist.setNoRek(System.currentTimeMillis() + "" + i);
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE, i);
            hist.setTglTransaksi(cal.getTime());
            Integer value = new Integer(i);
            hist.setMutasiKeluar((value.doubleValue() * 100000));
            hist.setMutasiMasuk((value.doubleValue() * 200000));
            hist.setTotalTransaksi(hist.getMutasiKeluar() + hist.getMutasiMasuk());

            list.add(hist);
        }
        return list;
    }
}
