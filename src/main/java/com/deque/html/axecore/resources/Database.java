package com.deque.html.axecore.resources;

import org.checkerframework.checker.units.qual.A;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Database 
{
    
    private static Database instance;
    private final List<String> webpages = new ArrayList<>();
    private final List<String> fwebpages = new ArrayList<>();

    public Database() throws MalformedURLException {
        loadAccessibilityData();
        loadFunctionalityData();
    }

    public static Database getInstance() throws MalformedURLException {
        if (instance == null) instance = new Database();
        return instance;
    }

    private void add(String webpage) throws MalformedURLException {
        webpages.add(webpage);
    }

    private void addf (String webpage) throws MalformedURLException
    {
        fwebpages.add(webpage);
    }

    public Collection<String> getWebpages() {
        return Collections.unmodifiableCollection(webpages);
    }

    public Collection<String> getfWebpages() {
        return Collections.unmodifiableCollection(fwebpages);
    }

    //Lägger URL länkar i webpages som strängar. //F innebär att funktionalitet har hittats eller är känd
    private void loadAccessibilityData() throws MalformedURLException {
        add("https://www.bth.se/");
        add("http://www.energimyndigheten.se/");
        add("https://www.spsm.se/");
        add("https://www.arn.se/");
        add("http://www.vetansvar.se/");
        add("https://arbetsformedlingen.se/");
        add("https://www.arbetsgivarverket.se/");
        add("https://www.av.se/"); //F
        add("https://www.arvsfonden.se/"); //F
        add("https://www.barnombudsmannen.se/");
        add("https://www.bfn.se/");
        add("https://www.bolagsverket.se/");
        add("https://www.boverket.se/");
        add("https://bra.se/");
        add("https://www.brottsoffermyndigheten.se/");
        add("https://cdfn.se/");
        add("https://www.csn.se/"); //F
        add("https://www.delmos.se/");
        add("https://www.do.se/");
        add("https://www.domstol.se/");
        add("https://www.domstol.se/kammarratten-i-sundsvall/");
        add("https://www.ehalsomyndigheten.se/");
        add("https://www.ekobrottsmyndigheten.se/");
        add("https://www.esv.se/");
        add("https://www.elsakerhetsverket.se/");
        add("https://www.ei.se/");
        add("https://etikprovningsmyndigheten.se/");
        add("https://www.ekn.se/");
        add("https://fmi.se/");
        add("https://www.fi.se/");
        add("https://www.fpr.se/");
        add("https://fba.se/");
        add("https://www.folkhalsomyndigheten.se/");
        add("https://forskarskattenamnden.se/");
        add("https://www.formas.se/");
        add("https://forte.se/");
        add("https://www.fortifikationsverket.se/");
        add("https://www.levandehistoria.se/");
        add("https://www.fmv.se/");
        add("https://www.fra.se/");
        add("https://www.fhs.se/");
        add("https://www.forsvarsmakten.se/sv/");
        add("https://www.forsakringskassan.se/privatpers/");
        add("http://www.genteknik.se/");
        add("https://www.gih.se/");
        add("https://www.gu.se/");
        add("http://www.harpsund.se/");
        add("https://www.havochvatten.se/");
        add("https://www.socialstyrelsen.se/hsan");
        add("https://www.du.se/");
        add("https://www.hb.se/");
        add("https://www.hig.se/");
        add("https://www.hh.se/");
        add("https://www.hkr.se/");
        add("https://www.his.se/");
        add("https://www.hv.se/");
        add("https://www.han.se/");
        add("https://svenskailo-kommitten.se/");
        add("https://www.iaf.se/");
        add("https://isf.se/");
        add("https://isp.se/");
        add("https://www.ivo.se/");
        add("https://www.ifau.se/");
        add("https://www.irf.se/sv/");
        add("https://www.isof.se/");
        add("https://www.imy.se/");
        add("https://www.justitiekanslern.se/");
        add("https://www.jamstalldhetsmyndigheten.se/");
        add("https://www.kammarkollegiet.se/");
        add("https://www.kau.se/");
        add("https://ki.se/");
        add("https://www.kemi.se/");
        add("https://www.klimatpolitiskaradet.se/");
        add("https://www.kommerskollegium.se/");
        add("https://www.konj.se/");
        add("https://www.konkurrensverket.se/");
        add("https://www.konstfack.se/");
        add("https://www.konstnarsnamnden.se/");
        add("https://www.konsumentverket.se/");
        add("https://www.kriminalvarden.se/");
        add("https://kronofogden.se/");
        add("https://www.kb.se/");
        add("https://kkh.se/sv/");
        add("https://www.kmh.se/");
        add("https://www.kth.se/");
        add("https://www.kustbevakningen.se/");
        add("http://www.karnavfallsfonden.se/");
        add("https://www.lagradet.se/");
        add("https://www.lantmateriet.se/");
        add("https://liu.se/");
        add("https://lnu.se/");
        add("https://www.livsmedelsverket.se/");
        add("https://www.ltu.se/");
        add("https://www.lu.se/");
        add("https://www.lakemedelsverket.se/sv");
        add("https://www.lansstyrelsen.se/");
        add("https://mau.se/");
        add("https://www.mi.se/");
        add("https://www.migrationsverket.se/");
        add("https://www.miun.se/");
        add("https://www.modernamuseet.se/stockholm/sv/");
        add("https://mynak.se/");
        add("https://www.mfd.se/");
        add("https://www.digg.se/");
        add("https://www.mfof.se/");
        add("https://kulturanalys.se/");
        add("https://www.mprt.se/");
        add("https://www.msb.se/");
        add("https://www.myndighetensst.se/");
        add("https://www.mtm.se/");
        add("https://www.tillvaxtanalys.se/");
        add("https://www.mucf.se/");
        add("https://www.vardanalys.se/");
        add("https://www.myh.se/");
        add("https://www.mdh.se/");
        add("https://www.nationalmuseum.se/");
        add("https://www.nrm.se/");
        add("https://www.naturvardsverket.se/");
        add("https://nai.uu.se/");
        add("https://nfh.se/");
        add("https://oredlighetsprovning.se/");
        add("https://www.namndenmotdiskriminering.se/");
        add("https://www.prv.se/sv/");
        add("https://www.pensionsmyndigheten.se/");
        add("https://www.polar.se/");
        add("https://polisen.se/");
        add("https://www.pts.se/");
        add("https://www.regeringen.se/");
        add("https://www.revisorsinspektionen.se/");
        add("https://www.raa.se/");
        add("https://riksarkivet.se/");
        add("https://www.riksgalden.se/");
        add("https://www.rymdstyrelsen.se/");
        add("https://www.rmv.se/");
        add("https://sameskolstyrelsen.se/");
        add("https://www.sametinget.se/");
        add("https://www.sida.se/");
        add("https://www.skatterattsnamnden.se/");
        add("https://www.skatteverket.se/");
        add("https://www.skogsstyrelsen.se/");
        add("https://www.skolfi.se/");
        add("https://www.overklagandenamnden.se/");
        add("https://www.socialstyrelsen.se/");
        add("http://www.spelinspektionen.se/");
        add("http://statensansvarsnamnd.se/");
        add("https://www.sbu.se/sv/");
        add("https://arkdes.se/");
        add("https://www.sfv.se/");
        add("https://sfhm.se/");
        add("https://www.sgi.se/");
        add("https://www.havkom.se/");
        add("https://shm.se/");
        add("http://www.siun.se/");
        add("https://www.stat-inst.se/");
        add("https://jordbruksverket.se/");
        add("https://statenskonstrad.se/");
        add("https://www.kulturradet.se/");
        add("https://www.smtm.se/");
        add("https://www.statensmedierad.se/");
        add("https://www.varldskulturmuseerna.se/");
        add("https://musikverket.se/");
        add("https://www.statenssc.se/");
        add("https://www.skolinspektionen.se/");
        add("https://www.skolverket.se/");
        add("https://www.spv.se/privatperson/statlig-tjanstepension/");
        add("https://www.sva.se/");
        add("https://www.vti.se/");
        add("https://www.scb.se/");
        add("https://www.statskontoret.se/");
        add("https://www.uniarts.se/");
        add("https://www.su.se/");
        add("https://www.stralsakerhetsmyndigheten.se/");
        add("https://www.swedac.se/");
        add("https://www.esf.se/");
        add("https://www.svenskafaokommitten.se/");
        add("https://si.se/");
        add("https://www.sieps.se/");
        add("https://svff.se/");
        add("https://www.sgu.se/");
        add("https://www.slu.se/");
        add("http://www.smhi.se/q/Stockholm/2673730");
        add("https://www.sakint.se/");
        add("https://www.sakerhetspolisen.se/");
        add("https://www.sh.se/");
        add("https://www.tlv.se/");
        add("https://tillvaxtverket.se/");
        add("https://www.foi.se/");
        add("https://www.pliktverket.se/");
        add("https://www.trafa.se/");
        add("https://www.trafikverket.se/");
        add("https://www.transportstyrelsen.se/sv/vagtrafik/");
        add("https://www.tullverket.se/sv/privat");
        add("https://www.umu.se/");
        add("https://www.uhr.se/");
        add("https://www.studera.nu/");
        add("https://www.antagning.se/se/start");
        add("https://www.utbyten.se/");
        add("https://www.uka.se/");
        add("https://www.upphandlingsmyndigheten.se/");
        add("https://www.uu.se/");
        add("https://www.val.se/");
        add("https://www.vinnova.se/");
        add("https://www.vr.se/");
        add("https://www.aklagare.se/");
        add("https://www.oru.se/");
        add("https://www.onep.se/");
        add("https://www.onh.se/");
        add("https://oks.se/");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/alkoholsortimentsnamnden");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/fideikommissnamnden");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/skiljenamnden-i-vissa-trygghetsfragor");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/statens-skaderegleringsnamnd");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/statens-overklagandenamnd");
        add("https://www.lansstyrelsen.se/jamtland.html"); 
        add("https://www.domstol.se/domarnamnden/");
        add("https://www.domstol.se/notarienamnden/");
        add("https://www.domstol.se/rattshjalpsnamnden/");
        add("https://www.domstol.se/rattshjalpsmyndigheten/");
        add("https://www.domstol.se/overklagandenamnden-for-namndemannauppdrag/");
    }
   
    public void loadFunctionalityData() throws MalformedURLException{
        //funktionalitetssidor
        addf("https://polisen.se/utsatt-for-brott/polisanmalan/");
        addf("https://polisen.se/utsatt-for-brott/olika-typer-av-brott/inbrott/");
        addf("https://arbetsformedlingen.se/platsbanken/");
        addf("https://arbetsformedlingen.se/platsbanken/annonser");
        addf("http://www.vetansvar.se/hurdugorenanmalan.4.307b1efa16147dc525719bbd.html");
        addf("http://www.vetansvar.se/gorenanmalan.4.7eee19da168944000cb8ae5e.html");
        addf("https://www.digg.se/digital-tillganglighet/anmal-bristande-tillganglighet");
        addf("https://www.digg.se/digital-tillganglighet/anmalan-om-bristande-tillganglighet");
        addf("https://www.socialstyrelsen.se/ansok-och-anmal/");
        addf("https://www.socialstyrelsen.se/ansok-och-anmal/inte-nojd-med-varden/");
    }
}
