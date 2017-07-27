
package dao;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import model.Resposta;


public class Respostadao {    
    PreparedStatement pst;
    String sql;
    
    public int salvar(Resposta resposta) throws SQLException {
        int idResposta =0;
        sql = "insert into resposta values (?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, NULL);
        pst.setString(2, resposta.getDescricao());
        pst.setInt(3, resposta.getId_pergunta());
        pst.execute();
        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next()){
            idResposta = rs.getInt(1);
        }
        pst.close();
        return idResposta;
    }

    public List<Resposta> Listaquiz(int idPergunta)throws SQLException{
        List<Resposta> listaResposta;
        listaResposta = new ArrayList<>();
        sql = "select * from resposta order by id";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, idPergunta);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaResposta.add(new Resposta(
                                rs.getInt("id"),
                                rs.getString("descricao")));
        }
        pst.close();
        return listaResposta;
    }
    
        public List<Resposta> ListaResposta()throws SQLException{
        List<Resposta> listaResposta;
        listaResposta = new ArrayList<>();
        sql = "select * from resposta order by id";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaResposta.add(new Resposta(
                                rs.getInt("id"),
                                rs.getString("descricao")));
        }
        pst.close();
        return listaResposta;
    }

    



}
