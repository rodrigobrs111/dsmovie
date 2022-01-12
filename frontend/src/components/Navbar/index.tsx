import {ReactComponent as GihubIcon} from 'assets/img/Vector.svg' // importando imagem para aproveitar em um componente
 

function Navbar(){

return (


    <header> 
    <nav className="Container"> 
      <div className="dsmovie-nav-content">
        <h1>DsMovie</h1>
        <a href="https://github.com/rodrigobrs111/dsmovie/commits/main">
            <div className="dsmovie-contact-container">
                <GihubIcon />
                <p className="dsmovie-contact-link">/devSuperior</p>
            </div>
        </a>
      </div>

   

    </nav>
  </header>

);
    
}

export default Navbar;