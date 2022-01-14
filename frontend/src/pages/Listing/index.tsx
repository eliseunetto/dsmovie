import axios from "axios";
import Pagination from "components/Pagination";
import { useState, useEffect } from "react";
import { BASE_URL } from "utils/request";
import { MoviePage } from "types/movies";
import MovieCard from "../../components/MovieCard/index";
import "./styles.css";

function Listing() {
  const [pageNumber, setPageNumber] = useState(0);

  useEffect(() => {
    axios.get(`${BASE_URL}/movies?size=12&page=1`).then((response) => {
      const data = response.data as MoviePage;
      console.log(data);
      setPageNumber(data.number);
    });
  }, []);

  return (
    <>
      <p>{pageNumber}</p>
      <Pagination />

      <div className="container">
        <div className="row">
          <div className="col-sm-6 col-md-4 col-lg-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-md-4 col-lg-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-md-4 col-lg-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-md-4 col-lg-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-md-4 col-lg-3 mb-3">
            <MovieCard />
          </div>
        </div>
      </div>
    </>
  );
}

export default Listing;
