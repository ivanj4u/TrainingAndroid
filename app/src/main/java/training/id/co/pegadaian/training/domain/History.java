package training.id.co.pegadaian.training.domain;

import java.util.Date;

/**
 * Created by ivan_j4u on 4/12/2016.
 */
public class History {

    private String namaNasabah;
    private String noRek;
    private Date tglTransaksi;
    private Double mutasiKeluar;
    private Double mutasiMasuk;
    private Double totalTransaksi;

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public Double getMutasiKeluar() {
        return mutasiKeluar;
    }

    public void setMutasiKeluar(Double mutasiKeluar) {
        this.mutasiKeluar = mutasiKeluar;
    }

    public Double getMutasiMasuk() {
        return mutasiMasuk;
    }

    public void setMutasiMasuk(Double mutasiMasuk) {
        this.mutasiMasuk = mutasiMasuk;
    }

    public Double getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(Double totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }
}
