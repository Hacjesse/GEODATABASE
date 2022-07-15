
package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "br_uf_2020")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "cd_uf")
    private String cd_uf;
    @Column(name = "nm_uf")
    private String nm_uf;
    @Column(name = "sigla_uf")
    private String sigla_uf;
    @Column(name = "nm_regiao")
    private String nm_regiao;
    @Column(name = "geom")
    private Geometry geometria; 

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCd_uf() {
        return cd_uf;
    }

    public void setCd_uf(String cd_uf) {
        this.cd_uf = cd_uf;
    }

    public String getNm_uf() {
        return nm_uf;
    }

    public void setNm_uf(String nm_uf) {
        this.nm_uf = nm_uf;
    }

    public String getSigla_uf() {
        return sigla_uf;
    }

    public void setSigla_uf(String sigla_uf) {
        this.sigla_uf = sigla_uf;
    }

    public String getNm_regiao() {
        return nm_regiao;
    }

    public void setNm_regiao(String nm_regiao) {
        this.nm_regiao = nm_regiao;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

   

    @Override
    public String toString() {
        return "Estado{" + "gid=" + gid + ", cd_uf=" + cd_uf + ", nm_uf=" + nm_uf + ", sigla_uf=" + sigla_uf + ", nm_regiao=" + nm_regiao + ", geom=" + geometria + '}';
    }
    
    
     
    
    
}
