
import lombok.*;
import lombok.experimental.Wither;

import java.time.LocalDateTime;

@Data
@Wither
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PessoaDTO {

    private Integer codigo;
    private String nome;
    private String telefone;
    private LocalDateTime nascimento;

}
