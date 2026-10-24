import { useState } from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.css";

function App() {
  const [tytul, setTytul] = useState("");
  const [rodzaj, setRodzaj] = useState("");

  const formHandler = (e) => {
    e.preventDefault();
    console.log(`tytul: ${tytul}; rodzaj: ${rodzaj}`)
  };

  return (
    <form className="m-4" onSubmit={(e) => formHandler(e)}>
      <div className="form-group mb-3">
        <label htmlFor="tytul-filmu">Tytuł filmu</label>
        <input
          className="form-control"
          id="tytul-filmu"
          value={tytul}
          onChange={(e) => setTytul(e.target.value)}
        />
      </div>
      <div className="form-group mb-3">
        <label htmlFor="rodzaj-filmu">Rodzaj</label>
        <select
          className="form-control"
          id="rodzaj-filmu"
          value={rodzaj}
          onChange={(e) => setRodzaj(e.target.value)}
        >
          <option></option>
          <option value={1}>Komedia</option>
          <option value={2}>Obyczajowy</option>
          <option value={3}>Sensacyjny</option>
          <option value={4}>Horror</option>
        </select>
      </div>

      <button className="btn btn-primary">Dodaj</button>
    </form>
  );
}

export default App;
