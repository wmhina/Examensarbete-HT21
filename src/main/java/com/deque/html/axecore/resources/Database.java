package com.deque.html.axecore.resources;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Database {
    private static Database instance;
    private final List<String> webpages = new ArrayList<>();

    public Database() throws MalformedURLException {
        loadData();
    }

    public static Database getInstance() throws MalformedURLException {
        if (instance == null) instance = new Database();
        return instance;
    }

    private void add(String webpage) throws MalformedURLException {
        webpages.add(webpage);
    }

    public Collection<String> getWebpages() {
        return Collections.unmodifiableCollection(webpages);
    }

    //Lägger URL länkar i webpages som strängar. //F innebär att funktionalitet har hittats eller är känd
    private void loadData() throws MalformedURLException {
        //hemsidor
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/alkoholsortimentsnamnden");
        add("https://www.arn.se/");
        add("http://www.vetansvar.se/");
        add("https://arbetsformedlingen.se/");
        add("https://www.arbetsgivarverket.se/");
        add("https://www.av.se/"); //F
        add("https://www.arvsfonden.se/"); //F
        add("https://www.barnombudsmannen.se/");
        //Nedan har inte funktionalitet tittats på än
        add("https://www.bth.se/");
        add("https://www.bfn.se/");
        add("https://www.bolagsverket.se/");
        add("https://www.boverket.se/");
        add("https://bra.se/");
        add("https://www.brottsoffermyndigheten.se/");
        add("https://cdfn.se/");
        add("https://www.csn.se/"); //F
        add("https://www.delmos.se/");
        add("https://www.do.se/");
        add("https://www.domstol.se/domarnamnden/");
        add("https://www.domstol.se/");
        add("https://www.ehalsomyndigheten.se/");
        add("https://www.ehalsomyndigheten.se/");
        add("https://www.ekobrottsmyndigheten.se/");
        add("https://www.esv.se/");
        add("https://www.elsakerhetsverket.se/");
        add("https://www.ei.se/");
        add("https://etikprovningsmyndigheten.se/");
        add("https://www.ekn.se/");
        add("https://fmi.se/");
        add("https://www.kammarkollegiet.se/om-oss/organisation/stod-till-andra-myndigheter/fideikommissnamnden");
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
        add("");

        //funktionalitetssidor
        add("https://arbetsformedlingen.se/platsbanken/");


        add("https://adokweb.arn.se/digiforms2/htmlViewer?xsessiontag=1403809502");
        add("http://www.vetansvar.se/gorenanmalan.4.7eee19da168944000cb8ae5e.html");
    }
}
