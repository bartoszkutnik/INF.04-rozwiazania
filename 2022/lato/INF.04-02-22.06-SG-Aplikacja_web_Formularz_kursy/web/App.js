import { useState } from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.css";

function App() {
  const [kursy, setKursy] = useState([
    "Programowanie w C#",
    "Angular dla początkujących",
    "Kurs Django",
  ]);
  const [imieNazwisko, setImieNazwisko] = useState("");
  const [numerKursu, setNumerKursu] = useState();

  const formHandler = (e) => {
    e.preventDefault();
    console.log(imieNazwisko);
    const indeksKursu = parseInt(numerKursu) - 1;

    if (indeksKursu >= 0 && indeksKursu < kursy.length) {
      console.log(kursy[indeksKursu]);
    } else {
      console.log("Nieprawidłowy numer kursu");
    }
  };

  return (
    <div className="container mt-4">
      <h2>Liczba kursów: {kursy.length}</h2>

      <ol>
        {kursy.map((kurs) => (
          <li key={kurs}>{kurs}</li>
        ))}
      </ol>

      <form onSubmit={formHandler}>
        <div className="mb-3">
          <label htmlFor="imie-nazwisko-input" className="form-label">
            Imię i nazwisko:
          </label>
          <input
            type="text"
            className="form-control"
            id="imie-nazwisko-input"
            value={imieNazwisko}
            onChange={(e) => setImieNazwisko(e.target.value)}
          />
        </div>

        <div className="mb-3">
          <label htmlFor="numer-kursu-input" className="form-label">
            Numer kursu:
          </label>
          <input
            type="number"
            className="form-control"
            id="numer-kursu-input"
            value={numerKursu}
            onChange={(e) => setNumerKursu(e.target.value)}
          />
        </div>
        <button type="submit" className="btn btn-primary">
          Zapisz do kursu
        </button>
      </form>
    </div>
  );
}

export default App;
