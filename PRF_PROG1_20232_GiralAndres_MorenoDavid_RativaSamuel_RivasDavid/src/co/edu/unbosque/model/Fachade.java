package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import co.edu.unbosque.model.persistence.ApostadoresDAO;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.ArchivoApostadores;
import co.edu.unbosque.model.persistence.ArchivoBaloto;
import co.edu.unbosque.model.persistence.ArchivoBetplay;
import co.edu.unbosque.model.persistence.ArchivoChance;
import co.edu.unbosque.model.persistence.ArchivoLoteria;
import co.edu.unbosque.model.persistence.ArchivoPropiedades;
import co.edu.unbosque.model.persistence.ArchivoSedes;
import co.edu.unbosque.model.persistence.ArchivoSuperastro;
import co.edu.unbosque.model.persistence.BalotoDAO;
import co.edu.unbosque.model.persistence.BetplayDAO;
import co.edu.unbosque.model.persistence.ChanceDAO;
import co.edu.unbosque.model.persistence.JuegosDAO;
import co.edu.unbosque.model.persistence.LoteriaDAO;
import co.edu.unbosque.model.persistence.ParametrosDAO;
import co.edu.unbosque.model.persistence.SedesDAO;
import co.edu.unbosque.model.persistence.SuperastroDAO;

public class Fachade {
	private ArrayList<JuegosDTO> juegos;
	private Archivo archivo;
	private JuegosDAO juegosDao;
	private File file = new File("Data/juegos.dat");
	
	private ArrayList<BalotoDTO> baloto;
	private ArchivoBaloto archBa;
	private BalotoDAO balotodao;
	private File fileBa = new File("Data/apuestas-baloto.dat");
	
	private ArrayList<BetPlayDTO> betplay;
	private ArchivoBetplay archBP;
	private BetplayDAO betplaydao;
	private File fileBP = new File("Data/apuestas-betplay.dat");
	
	private ArrayList<ChanceDTO> chance;
	private ArchivoChance archC;
	private ChanceDAO chancedao;
	private File fileC = new File("Data/apuestas-chance.dat");
	
	
	private ArrayList<LoteriaDTO> loteria;
	private LoteriaDTO lot;
	private ArchivoLoteria archL;
	private LoteriaDAO loteriadao;
	private File fileL = new File("Data/apuestas-loteria.dat");
	
	private ArrayList<SuperAstroDTO> superas;
	private ArchivoSuperastro archSA;
	private SuperastroDAO SAdao;
	private File fileSA = new File("Data/apuestas-superastro.dat");
	
	private ArrayList<ParametrosDTO> parametros;
	private ArchivoPropiedades archprop;
	private ParametrosDAO parametrosdao;
	private File fileParametros = new File("Data/config.dat");
	
	private File filesedes=new File("Data/sedes.dat");
	private ArrayList<SedesDTO> sedes;
	private ArchivoSedes archivosedes;
	private SedesDAO sedesDAO;
	
	private ArrayList<ApostadoresDTO>apostadores;
	private ArchivoApostadores archivoAp;
	private ApostadoresDAO apostadoresdao;
	private File fileAp=new File("Data/apostadores.dat");
	
	private double cincoDig;
	private Date fecha;
	
	public Fachade() {
		juegos = new ArrayList<JuegosDTO>();
		archivo = new Archivo(file);
		juegosDao = new JuegosDAO(archivo);
		juegos = archivo.leerArchivo(file);
		
		baloto = new ArrayList<BalotoDTO>();
		archBa = new ArchivoBaloto(fileBa);
		balotodao = new BalotoDAO(archBa);
		baloto = archBa.leerArchivo(fileBa);
		
		betplay = new ArrayList<BetPlayDTO>();
		archBP = new ArchivoBetplay(fileBP);
		betplaydao = new BetplayDAO(archBP);
		betplay = archBP.leerArchivo(fileBP);
		
		chance = new ArrayList<ChanceDTO>();
		archC = new ArchivoChance(fileC);
		chancedao = new ChanceDAO(archC);
		chance = archC.leerArchivo(fileC);
		lot = new LoteriaDTO(null, null, null, null, null);
		
		loteria = new ArrayList<LoteriaDTO>();
		archL = new ArchivoLoteria(fileL);
		loteriadao = new LoteriaDAO(archL);
		loteria = archL.leerArchivo(fileL);
		
		superas = new ArrayList<SuperAstroDTO>();
		archSA = new ArchivoSuperastro(fileSA);
		SAdao = new SuperastroDAO(archSA);
		superas = archSA.leerArchivo(fileSA);
		
		parametros = new ArrayList<ParametrosDTO>();
		archprop = new ArchivoPropiedades(fileParametros);
		parametrosdao = new ParametrosDAO(archprop);
		parametros = archprop.leerArchivo(fileParametros);
		
		sedes=new ArrayList<SedesDTO>();
		archivosedes=new ArchivoSedes(filesedes);
		sedesDAO=new SedesDAO(archivosedes);
		sedes = archivosedes.leerArchivoSedes(filesedes);
		
		apostadores=new ArrayList<ApostadoresDTO>();
		archivoAp=new ArchivoApostadores(fileAp);
		apostadoresdao=new ApostadoresDAO(archivoAp);
		apostadores=archivoAp.LeerArchivo(fileAp);
		
		fecha = new Date();
		cincoDig = 10000+ Math.random()*90000;
	}

	public int obtenerNumCincoDig() {
		double cincoDig = 10000+Math.random()*90000;
		return (int)cincoDig;
	}
	
	public static <ApostadoresDTO> int searchArrayList(ArrayList<ApostadoresDTO> aps, ApostadoresDTO element) {
	    return aps.indexOf(element);
	}
	public ArrayList<JuegosDTO> getJuegos() {
		return juegos;
	}

	public void setJuegos(ArrayList<JuegosDTO> juegos) {
		this.juegos = juegos;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public JuegosDAO getJuegosDao() {
		return juegosDao;
	}

	public void setJuegosDao(JuegosDAO juegosDao) {
		this.juegosDao = juegosDao;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ArrayList<ParametrosDTO> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<ParametrosDTO> parametros) {
		this.parametros = parametros;
	}

	public ArchivoPropiedades getArchprop() {
		return archprop;
	}

	public void setArchprop(ArchivoPropiedades archprop) {
		this.archprop = archprop;
	}

	public ParametrosDAO getParametrosdao() {
		return parametrosdao;
	}

	public void setParametrosdao(ParametrosDAO parametrosdao) {
		this.parametrosdao = parametrosdao;
	}

	public File getFileParametros() {
		return fileParametros;
	}

	public void setFileParametros(File fileParametros) {
		this.fileParametros = fileParametros;
	}

	public File getFilesedes() {
		return filesedes;
	}

	public void setFilesedes(File filesedes) {
		this.filesedes = filesedes;
	}

	public ArrayList<SedesDTO> getSedes() {
		return sedes;
	}

	public void setSedes(ArrayList<SedesDTO> sedes) {
		this.sedes = sedes;
	}

	public ArchivoSedes getArchivosedes() {
		return archivosedes;
	}

	public void setArchivosedes(ArchivoSedes archivosedes) {
		this.archivosedes = archivosedes;
	}

	public SedesDAO getSedesDAO() {
		return sedesDAO;
	}

	public void setSedesDAO(SedesDAO sedesDAO) {
		this.sedesDAO = sedesDAO;
	}

	public ArrayList<ApostadoresDTO> getApostadores() {
		return apostadores;
	}

	public void setApostadores(ArrayList<ApostadoresDTO> apostadores) {
		this.apostadores = apostadores;
	}

	public ArchivoApostadores getArchivoAp() {
		return archivoAp;
	}

	public void setArchivoAp(ArchivoApostadores archivoAp) {
		this.archivoAp = archivoAp;
	}

	public ApostadoresDAO getApostadoresdao() {
		return apostadoresdao;
	}

	public void setApostadoresdao(ApostadoresDAO apostadoresdao) {
		this.apostadoresdao = apostadoresdao;
	}

	public File getFileAp() {
		return fileAp;
	}

	public void setFileAp(File fileAp) {
		this.fileAp = fileAp;
	}

	public ArrayList<BalotoDTO> getBaloto() {
		return baloto;
	}

	public void setBaloto(ArrayList<BalotoDTO> baloto) {
		this.baloto = baloto;
	}

	public ArchivoBaloto getArchBa() {
		return archBa;
	}

	public void setArchBa(ArchivoBaloto archBa) {
		this.archBa = archBa;
	}

	public BalotoDAO getBalotodao() {
		return balotodao;
	}

	public void setBalotodao(BalotoDAO balotodao) {
		this.balotodao = balotodao;
	}

	public File getFileBa() {
		return fileBa;
	}

	public void setFileBa(File fileBa) {
		this.fileBa = fileBa;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ArrayList<BetPlayDTO> getBetplay() {
		return betplay;
	}

	public void setBetplay(ArrayList<BetPlayDTO> betplay) {
		this.betplay = betplay;
	}

	public ArchivoBetplay getArchBP() {
		return archBP;
	}

	public void setArchBP(ArchivoBetplay archBP) {
		this.archBP = archBP;
	}

	public BetplayDAO getBetplaydao() {
		return betplaydao;
	}

	public void setBetplaydao(BetplayDAO betplaydao) {
		this.betplaydao = betplaydao;
	}

	public File getFileBP() {
		return fileBP;
	}

	public void setFileBP(File fileBP) {
		this.fileBP = fileBP;
	}

	public ArrayList<ChanceDTO> getChance() {
		return chance;
	}

	public void setChance(ArrayList<ChanceDTO> chance) {
		this.chance = chance;
	}

	public ArchivoChance getArchC() {
		return archC;
	}

	public void setArchC(ArchivoChance archC) {
		this.archC = archC;
	}

	public ChanceDAO getChancedao() {
		return chancedao;
	}

	public void setChancedao(ChanceDAO chancedao) {
		this.chancedao = chancedao;
	}

	public File getFileC() {
		return fileC;
	}

	public void setFileC(File fileC) {
		this.fileC = fileC;
	}

	public LoteriaDTO getLot() {
		return lot;
	}

	public void setLot(LoteriaDTO lot) {
		this.lot = lot;
	}

	public ArrayList<LoteriaDTO> getLoteria() {
		return loteria;
	}

	public void setLoteria(ArrayList<LoteriaDTO> loteria) {
		this.loteria = loteria;
	}

	public ArchivoLoteria getArchL() {
		return archL;
	}

	public void setArchL(ArchivoLoteria archL) {
		this.archL = archL;
	}

	public LoteriaDAO getLoteriadao() {
		return loteriadao;
	}

	public void setLoteriadao(LoteriaDAO loteriadao) {
		this.loteriadao = loteriadao;
	}

	public File getFileL() {
		return fileL;
	}

	public void setFileL(File fileL) {
		this.fileL = fileL;
	}

	public ArrayList<SuperAstroDTO> getSuperas() {
		return superas;
	}

	public void setSuperas(ArrayList<SuperAstroDTO> superas) {
		this.superas = superas;
	}

	public ArchivoSuperastro getArchSA() {
		return archSA;
	}

	public void setArchSA(ArchivoSuperastro archSA) {
		this.archSA = archSA;
	}

	public SuperastroDAO getSAdao() {
		return SAdao;
	}

	public void setSAdao(SuperastroDAO sAdao) {
		SAdao = sAdao;
	}

	public File getFileSA() {
		return fileSA;
	}

	public void setFileSA(File fileSA) {
		this.fileSA = fileSA;
	}
	
	
}
