
import { useState } from 'react'; 
import './App.css';

}
function App() {
  const [newTaskName, setNewTaskName]=useState()
  const handleSubmit=(f)=>{
  f.preventDefault();
  localStorage.setItem('task', setNewTaskName)
  setNewTaskName('')
  return (
    <div className="App">
      <form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="Ingrese la tarea"
        onChange={(f) => setNewTaskName(f.target.value)}
      />
      <button>salvar tarea</button>
      </form>
    </div>
  );
}

export default App;
