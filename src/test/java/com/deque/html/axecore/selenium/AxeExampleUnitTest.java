/*
 * Copyright (C) 2020 Deque Systems Inc.,
 *
 * Your use of this Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This entire copyright notice must appear in every copy of this file you
 * distribute or in any file that contains substantial portions of this source
 * code.
 */

package com.deque.html.axecore.selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.deque.html.axecore.axeargs.AxeRunOnlyOptions;
import com.deque.html.axecore.axeargs.AxeRunOptions;
import com.deque.html.axecore.resources.Database;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 * The example tests using the updated files.
 */
public class AxeExampleUnitTest {

  private WebDriver webDriver;

  /**
   * Instantiate the WebDriver and navigate to the test site
   */
  @Before
  public void setUp() {
    // ChromeDriver needed to test for Shadow DOM testing support
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
    webDriver = new ChromeDriver(options);
  }

  /**
   * Ensure we close the WebDriver after finishing
   */
  @After
  public void tearDown() {
    webDriver.quit();
  }

  @Test
  public void checkAcessibility() throws MalformedURLException {
    // Ange vilka regler som ska testas mot, i vårt fall wcag2a
    AxeRunOnlyOptions runOnlyOptions = new AxeRunOnlyOptions();
    runOnlyOptions.setType("tag");
    runOnlyOptions.setValues(Arrays.asList("wcag2a"));

    // Instansiera builder-objekt, ange options
    AxeRunOptions options = new AxeRunOptions();
    options.setRunOnly(runOnlyOptions);
    AxeBuilder axe = new AxeBuilder().withOptions(options);
    axe.withoutIframeSandboxes();

    // Hämta databasen
    Database db = new Database();
    Collection<String> pages = db.getWebpages();

    // Skapa filen som resultaten ska skrivas till
    File file = new File("src\\test\\java\\results\\results.txt");
    try (FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw)) {

      // Kör tillgänglighetstest på URLs, skriv ut resultaten i filen
      for (Iterator<String> iterator = pages.iterator(); iterator.hasNext();) {
        this.webDriver.get(iterator.next());
        Results result = axe.analyze(webDriver);
        List<Rule> violationList = result.getViolations();

        // Rapportera resultat
        System.out.println(result.getUrl());
        /* These results indicate what elements failed the rules */
        System.out.println("Violation list size :" + result.getViolations().size());

        /*
         * These results indicate which rules did not run because no matching content
         * was found on the page. For example, with no video, those rules won't run.
         */
        System.out.println("Inapplicable list size :" + result.getInapplicable().size());

        /*
         * These results were aborted and require further testing. This can happen
         * either because of technical restrictions to what the rule can test, or
         * because a javascript error occurred.
         */
        System.out.println("Incomplete list size :" + result.getIncomplete().size());

        AxeReporter.getReadableAxeResults("", this.webDriver, violationList);
        out.println(AxeReporter.getAxeResultString() + System.lineSeparator());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @Test
  public void checkFunctionAcessibility() {

    final List<String> pages = new ArrayList<>();
    pages.add("https://arbetsformedlingen.se/platsbanken/");
    pages.add("https://arbetsformedlingen.se/platsbanken/annonser");

    // Ange vilka regler som ska testas mot, i vårt fall wcag2a
    AxeRunOnlyOptions runOnlyOptions = new AxeRunOnlyOptions();
    runOnlyOptions.setType("tag");
    runOnlyOptions.setValues(Arrays.asList("wcag2a"));

    // Instansiera builder-objekt, ange options
    AxeRunOptions options = new AxeRunOptions();
    options.setRunOnly(runOnlyOptions);
    AxeBuilder axe = new AxeBuilder().withOptions(options);
    axe.withoutIframeSandboxes();

    // Skapa filen som resultaten ska skrivas till
    File file = new File("src\\test\\java\\results\\functionresults.txt");
    try (FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw)) {

      // Kör tillgänglighetstest på URLs, skriv ut resultaten i filen
      for (Iterator<String> iterator = pages.iterator(); iterator.hasNext();) {
        this.webDriver.get(iterator.next());
        Results result = axe.analyze(webDriver);
        List<Rule> violationList = result.getViolations();

        // Rapportera resultat
        System.out.println(result.getUrl());
        /* These results indicate what elements failed the rules */
        System.out.println("Violation list size :" + result.getViolations().size());

        /*
         * These results indicate which rules did not run because no matching content
         * was found on the page. For example, with no video, those rules won't run.
         */
        System.out.println("Inapplicable list size :" + result.getInapplicable().size());

        /*
         * These results were aborted and require further testing. This can happen
         * either because of technical restrictions to what the rule can test, or
         * because a javascript error occurred.
         */
        System.out.println("Incomplete list size :" + result.getIncomplete().size());

        AxeReporter.getReadableAxeResults("", this.webDriver, violationList);
        out.println(AxeReporter.getAxeResultString() + System.lineSeparator());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
