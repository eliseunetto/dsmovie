import "./styles.css";

const Footer = () => {
  return (
    <footer className="footer">
      <div className="container">
        <p className="text-footer">
          App desenvolvido por{" "}
          <a
            href="https://www.linkedin.com/in/eliseunetto/"
            target="_blank"
            rel="noreferrer"
          >
            @eliseunetto
          </a>
        </p>
        <p className="text-footer">
          <small>
            <strong>Semana Spring React</strong>
            <br />
            Evento promovido por DevSuperior:{" "}
            <a
              href="https://instagram.com/devsuperior.ig"
              target="_blank"
              rel="noreferrer"
            >
              @devsuperior.ig
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
};

export default Footer;
