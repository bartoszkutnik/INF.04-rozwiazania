import { useState } from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.css';

interface Image {
  id: number;
  alt: string;
  filename: string;
  category: number;
  downloads: number;
}

function App() {

  const [images, setImages] = useState<Image[]>([
    { id: 0, alt: "Mak", filename: "obraz1.jpg", category: 1, downloads: 35 },
    { id: 1, alt: "Bukiet", filename: "obraz2.jpg", category: 1, downloads: 43 },
    { id: 2, alt: "Dalmatyńczyk", filename: "obraz3.jpg", category: 2, downloads: 2 },
    { id: 3, alt: "Świnka morska", filename: "obraz4.jpg", category: 2, downloads: 53 },
    { id: 4, alt: "Rotwailer", filename: "obraz5.jpg", category: 2, downloads: 43 },
    { id: 5, alt: "Audi", filename: "obraz6.jpg", category: 3, downloads: 11 },
    { id: 6, alt: "kotki", filename: "obraz7.jpg", category: 2, downloads: 22 },
    { id: 7, alt: "Róża", filename: "obraz8.jpg", category: 1, downloads: 33 },
    { id: 8, alt: "Świnka morska", filename: "obraz9.jpg", category: 2, downloads: 123 },
    { id: 9, alt: "Foksterier", filename: "obraz10.jpg", category: 2, downloads: 22 },
    { id: 10, alt: "Szczeniak", filename: "obraz11.jpg", category: 2, downloads: 12 },
    { id: 11, alt: "Garbus", filename: "obraz12.jpg", category: 3, downloads: 321 }
  ]);

  const [categories, setCategories] = useState<number[]>([1, 2, 3]);

  const downloadHandle = (id: number)=>{
      setImages(images.map((image => 
        id === image.id ? {...image, downloads: image.downloads + 1} : image
      )))
  }

  const toggleCategory = (category: number)=>{
    setCategories(
      categories.includes(category) ?
        categories.filter(c => c !== category)
        :
        [...categories, category]
    )
  }

  const filteredImages = images.filter(image => categories.includes(image.category));

  return (
    <>
      <h1>Kategorie zdjęć</h1>
      <div className="form-check form-switch form-check-inline">
        <input className="form-check-input" type="checkbox" id="kwiaty" defaultChecked onChange={()=> toggleCategory(1)}/>
        <label className="form-check-label" htmlFor="kwiaty">Kwiaty</label>
      </div>
      <div className="form-check form-switch form-check-inline">
        <input className="form-check-input" type="checkbox" id="zwierzeta" defaultChecked onChange={()=> toggleCategory(2)}/>
        <label className="form-check-label" htmlFor="zwierzeta">Zwierzęta</label>
      </div>
      <div className="form-check form-switch form-check-inline">
        <input className="form-check-input" type="checkbox" id="samochody" defaultChecked onChange={()=> toggleCategory(3)}/>
        <label className="form-check-label" htmlFor="samochody">Samochody</label>
      </div><br></br>
      {filteredImages.map(({ id, alt, filename, downloads }) => (
        <div key={id} className="blok" style={{ float: 'left' }}>
          <img src={'src/assets/'+filename} alt={alt} style={{margin: '5px', borderRadius: '15px'}}/>
          <h4>Pobrań: {downloads}</h4>
          <button className='btn btn-success' onClick={()=> downloadHandle(id)}>Pobierz</button>
        </div>
      ))}
    </>
  )
}

export default App
