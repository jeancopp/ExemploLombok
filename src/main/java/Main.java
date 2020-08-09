import lombok.extern.java.Log;

import java.time.LocalDateTime;
import java.time.Month;

@Log
public class Main {

    public static void main(String[] args) {
        final LocalDateTime aniversario = LocalDateTime.of(1990, Month.JULY, 26, 00, 55);
        PessoaDTO pessoa = PessoaDTO.builder()
                .codigo(10)
                .nome("Jean Coppieters")
                .nascimento(aniversario)
                .telefone("14-99999-9999")
                .build();

        log.info("Pessoa:" + pessoa);
        log.info("Hashcode:" + pessoa.hashCode());


        PessoaDTO pessoaCriadaComConstrutor = new PessoaDTO(11, "Jean Coppieters", "44-99999-9999", aniversario);
        log.info(pessoaCriadaComConstrutor.toString());
        log.info("Hashcode:" + pessoaCriadaComConstrutor.hashCode());

    }
}
