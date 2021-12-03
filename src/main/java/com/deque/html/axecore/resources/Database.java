package com.deque.html.axecore.resources;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Database 
{
    private static Database instance;
    private final List<String> webpages = new ArrayList<>();

    public Database() throws MalformedURLException 
    {
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

    private void loadData() throws MalformedURLException {
        add("https://www.arn.se/");
        add("https://adokweb.arn.se/digiforms2/htmlViewer?xsessiontag=1403809502");
        add("http://www.vetansvar.se/");
        add("http://www.vetansvar.se/gorenanmalan.4.7eee19da168944000cb8ae5e.html");
        add("https://arbetsformedlingen.se/");
        //TODO: Ska arbetsförmedlingen ha en, flera eller inga extra sidor testade?
        add("https://www.arbetsgivarverket.se/");
        add("https://www.av.se/");
        //TODO: Hur många funktioner ska vi ta med? Det blir många även i två steg från hemsidan
        add("https://www.arvsfonden.se/");
        //TODO:Testa idé med som sida att testas?
        add("https://www.barnombudsmannen.se/");
        add("https://www.bth.se/");
        //Todo: hur mycket ska tas med här?
        add("https://www.bfn.se/");
        add("https://www.bolagsverket.se/");
        add("https://www.boverket.se/");
    }
}
