import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;

public class Correo {
    public static void enviarCodigoAutorizacion(String correoDestino, String usuario, String clave, String codigo) {
        final String correoEmisor = "victorrojascordova@gmail.com";
        final String claveEmisor = "aqhj lhoy dkzb rsun";  // <- Reemplaza esto

        String mensaje = """
                         Se ha solicitado acceso al sistema.
                         
                         Usuario: """ + usuario + "\nContraseña: " + clave +
                         "\n\nCódigo de autorización: " + codigo;

        try {
            java.util.Properties props = new java.util.Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            javax.mail.Session session = javax.mail.Session.getInstance(props, new javax.mail.Authenticator() {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(correoEmisor, claveEmisor);
                }
            });

            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new javax.mail.internet.InternetAddress(correoEmisor));
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                javax.mail.internet.InternetAddress.parse(correoDestino));
            message.setSubject("Solicitud de acceso - Código de autorización");
            message.setText(mensaje);

            javax.mail.Transport.send(message);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage());
        }
    }
}
