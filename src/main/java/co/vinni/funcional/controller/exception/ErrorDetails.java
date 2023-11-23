package co.vinni.funcional.controller.exception;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
    private Date fecha;
    private String mensaje;
    private String detalle;
}
