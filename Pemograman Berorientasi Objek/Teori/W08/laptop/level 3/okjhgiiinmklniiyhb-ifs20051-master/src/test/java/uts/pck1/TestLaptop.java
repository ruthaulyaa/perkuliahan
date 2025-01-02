//TestLaptop.java
package uts.pck1;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestLaptop {

	Laptop rum;
		
	static Stream<Arguments> rumArray1() {
    return Stream.of(
        Arguments.of("laptop asus zen book duo",14,new Prosesor(),6.00,512.00),
        Arguments.of("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00),
		Arguments.of("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00)
    );}
	static Stream<Arguments> rumArray2() {
    return Stream.of(
        Arguments.of(new Laptop("laptop asus zen book duo",14,new Prosesor(),6.00,512.00)),
        Arguments.of(new Laptop("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00)),
		Arguments.of(new Laptop("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00))
    );}
	
	static Stream<Arguments> rumArray3() {
    return Stream.of(
        Arguments.of("laptop asus zen book duo",14,new Prosesor(),6.00,512.00,new Laptop("laptop asus zen book duo",14,new Prosesor(),6.00,512.00)),
        Arguments.of("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00,new Laptop("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00)),
		Arguments.of("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00,new Laptop("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00))
    );}

	static Stream<Arguments> rumArray4() {
    return Stream.of(
        Arguments.of(new Laptop("laptop asus zen book duo",14,new Prosesor(),6.00,512.00),"Spesifikasi laptop asus zen book duo:ukuran layar 14, prosesor Intel Core i5-5820K 4 inti, RAM 6.0 GB, harddisk 512.0 GB"),
        Arguments.of(new Laptop("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00),"Spesifikasi laptop accer travelmate 6321:ukuran layar 12, prosesor Intel Core i5-5820K 4 inti, RAM 2.0 GB, harddisk 512.0 GB"),
		Arguments.of(new Laptop("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00),"Spesifikasi laptop lenovo:ukuran layar 15, prosesor Intel Core i7-5820K 8 inti, RAM 6.0 GB, harddisk 1024.0 GB")
    );}
	
	static Stream<Arguments> rumArray5() {
    return Stream.of(
        Arguments.of(new Laptop("laptop asus zen book duo",14,new Prosesor(),6.00,512.00),"adobe premiere",6.5,100,"\nSpesifikasi Laptop tidak sanggup menjalankan aplikasi adobe premiere"),
        Arguments.of(new Laptop("laptop accer travelmate 6321",12,new Prosesor(),2.00,512.00), "notepad++", 0.5,0.5,"\nLaptop sedang menjalankan aplikasi notepad++ sisa ram:1.5 GB, sisa harddisk:511.5 GB"),
		Arguments.of(new Laptop("laptop lenovo",15,new Prosesor("Intel Core i7-5820K",8),6.00,1024.00),"OBS", 1.5, 50.0,"\nLaptop sedang menjalankan aplikasi OBS sisa ram:4.5 GB, sisa harddisk:974.0 GB")
    );}
	
	@Test
	public void testInheritance()
	{ 
		 rum = new Laptop();
		 Komputer bangn=new Laptop(rum);
		 assertEquals(rum, bangn);
	}
	@Test
	public void testGetSetJenis() {
		Komputer absCls = mock(
		  Komputer.class, 
		  CALLS_REAL_METHODS);
		absCls.setJenis("laptop asus");
		  absCls.getJenis();
	}
	
	@Test
	public void testGetSetUkuranLayar() {
		Komputer absCls = mock(Komputer.class, CALLS_REAL_METHODS);
		absCls.setUkuranLayar(14);
		absCls.getUkuranLayar();
	}
	
	@Test
	public void testKonstruktorI()
	{ 
		 rum = new Laptop();
		 assertThat("laptop asus", equalToIgnoringCase(rum.getJenis()));
		 assertEquals(14, rum.getUkuranLayar());
		 assertEquals(new Prosesor(), rum.getProsesor());
		 assertEquals(4.00, rum.getRam()); 
		 assertEquals(1024.00, rum.getHarddisk()); 
	}
	@ParameterizedTest
	@MethodSource("rumArray1")
	public void testKonstruktorII(String jen, int uk, Prosesor pro, double ram, double hdd) {
		rum = new Laptop(jen,uk,pro,ram,hdd);
		assertThat(jen, equalToIgnoringCase(rum.getJenis()));
		 assertEquals(uk, rum.getUkuranLayar());
		 assertEquals(pro, rum.getProsesor());
		 assertEquals(ram, rum.getRam()); 
		 assertEquals(hdd, rum.getHarddisk());  
	}
	

	@ParameterizedTest
	@MethodSource("rumArray2")
	public void testKopiKonstruktor(Laptop r) {
		rum = new Laptop(r);
		assertThat(r.getJenis(), equalToIgnoringCase(rum.getJenis()));
		 assertEquals(r.getUkuranLayar(), rum.getUkuranLayar());
		 assertEquals(r.getProsesor(), rum.getProsesor());
		 assertEquals(r.getRam(), rum.getRam()); 
		 assertEquals(r.getHarddisk(), rum.getHarddisk()); 
		 assertNotSame(r.getProsesor(), rum.getProsesor(), "should not point to same Object");
		 assertNotSame(r,rum, "should not point to same Object");
	}

	@ParameterizedTest
	@MethodSource("rumArray3")
	void testSetter(String jen, int uk, Prosesor pro, double ram, double hdd,Laptop r) {
		rum = new Laptop();
		rum.setJenis(jen);
		rum.setUkuranLayar(uk);
		rum.setProsesor(pro);
		rum.setRam(ram);
		rum.setHarddisk(hdd);
		assertEquals(r, rum); 
	}
	
	@ParameterizedTest
	@MethodSource("rumArray4")
	void testToString(Laptop r, String s) {
		assertThat(r.toString(), containsString(s));
	}
	
	@ParameterizedTest
	@MethodSource("rumArray5")
	void testMenjalankanAplikasi(Laptop lap, String nama, double r, double hdd, String psn) {
		assertThat(lap.menjalankanAplikasi(nama,r,hdd), containsString(psn));
	}
}