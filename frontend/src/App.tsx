import DataTable from 'Components/DataTable'
import Footer from 'Components/Footer'
import NavBar from 'Components/Navbar'

function App() {
  return (
    <>
      <NavBar />
      <div className='container'>
        <h1 className='text-primary'>DevSuperior</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  )
}

export default App
