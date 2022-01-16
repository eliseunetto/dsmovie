import { useParams } from "react-router-dom";
import FormCard from "components/FormCard";
import Footer from "components/Footer";

function Form() {
  const params = useParams();

  return (
    <>
      <FormCard movieId={`${params.movieId}`} />
      <Footer />
    </>
  );
}

export default Form;
