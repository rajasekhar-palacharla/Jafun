//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.01 at 12:21:10 PM CDT 
//


package com.practicalHadoop.ooziewf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.practicalHadoop.ooziewf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WorkflowApp_QNAME = new QName("uri:oozie:workflow:0.3", "workflow-app");
    private final static QName _Switch_QNAME = new QName("uri:oozie:workflow:0.3", "switch");
    private final static QName _Java_QNAME = new QName("uri:oozie:workflow:0.3", "java");
    private final static QName _SubWorkflow_QNAME = new QName("uri:oozie:workflow:0.3", "sub-workflow");
    private final static QName _Fs_QNAME = new QName("uri:oozie:workflow:0.3", "fs");
    private final static QName _Kill_QNAME = new QName("uri:oozie:workflow:0.3", "kill");
    private final static QName _MapReduce_QNAME = new QName("uri:oozie:workflow:0.3", "map-reduce");
    private final static QName _Pig_QNAME = new QName("uri:oozie:workflow:0.3", "pig");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.practicalHadoop.ooziewf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CREDENTIAL }
     * 
     */
    public CREDENTIAL createCREDENTIAL() {
        return new CREDENTIAL();
    }

    /**
     * Create an instance of {@link CONFIGURATION }
     * 
     */
    public CONFIGURATION createCONFIGURATION() {
        return new CONFIGURATION();
    }

    /**
     * Create an instance of {@link WORKFLOWAPP }
     * 
     */
    public WORKFLOWAPP createWORKFLOWAPP() {
        return new WORKFLOWAPP();
    }

    /**
     * Create an instance of {@link FS }
     * 
     */
    public FS createFS() {
        return new FS();
    }

    /**
     * Create an instance of {@link SUBWORKFLOW }
     * 
     */
    public SUBWORKFLOW createSUBWORKFLOW() {
        return new SUBWORKFLOW();
    }

    /**
     * Create an instance of {@link KILL }
     * 
     */
    public KILL createKILL() {
        return new KILL();
    }

    /**
     * Create an instance of {@link JAVA }
     * 
     */
    public JAVA createJAVA() {
        return new JAVA();
    }

    /**
     * Create an instance of {@link SWITCH }
     * 
     */
    public SWITCH createSWITCH() {
        return new SWITCH();
    }

    /**
     * Create an instance of {@link MAPREDUCE }
     * 
     */
    public MAPREDUCE createMAPREDUCE() {
        return new MAPREDUCE();
    }

    /**
     * Create an instance of {@link PIG }
     * 
     */
    public PIG createPIG() {
        return new PIG();
    }

    /**
     * Create an instance of {@link STREAMING }
     * 
     */
    public STREAMING createSTREAMING() {
        return new STREAMING();
    }

    /**
     * Create an instance of {@link PREPARE }
     * 
     */
    public PREPARE createPREPARE() {
        return new PREPARE();
    }

    /**
     * Create an instance of {@link DEFAULT }
     * 
     */
    public DEFAULT createDEFAULT() {
        return new DEFAULT();
    }

    /**
     * Create an instance of {@link CASE }
     * 
     */
    public CASE createCASE() {
        return new CASE();
    }

    /**
     * Create an instance of {@link PIPES }
     * 
     */
    public PIPES createPIPES() {
        return new PIPES();
    }

    /**
     * Create an instance of {@link DELETE }
     * 
     */
    public DELETE createDELETE() {
        return new DELETE();
    }

    /**
     * Create an instance of {@link JOIN }
     * 
     */
    public JOIN createJOIN() {
        return new JOIN();
    }

    /**
     * Create an instance of {@link ACTION }
     * 
     */
    public ACTION createACTION() {
        return new ACTION();
    }

    /**
     * Create an instance of {@link FLAG }
     * 
     */
    public FLAG createFLAG() {
        return new FLAG();
    }

    /**
     * Create an instance of {@link FORKTRANSITION }
     * 
     */
    public FORKTRANSITION createFORKTRANSITION() {
        return new FORKTRANSITION();
    }

    /**
     * Create an instance of {@link ACTIONTRANSITION }
     * 
     */
    public ACTIONTRANSITION createACTIONTRANSITION() {
        return new ACTIONTRANSITION();
    }

    /**
     * Create an instance of {@link MKDIR }
     * 
     */
    public MKDIR createMKDIR() {
        return new MKDIR();
    }

    /**
     * Create an instance of {@link MOVE }
     * 
     */
    public MOVE createMOVE() {
        return new MOVE();
    }

    /**
     * Create an instance of {@link FORK }
     * 
     */
    public FORK createFORK() {
        return new FORK();
    }

    /**
     * Create an instance of {@link CREDENTIALS }
     * 
     */
    public CREDENTIALS createCREDENTIALS() {
        return new CREDENTIALS();
    }

    /**
     * Create an instance of {@link START }
     * 
     */
    public START createSTART() {
        return new START();
    }

    /**
     * Create an instance of {@link DECISION }
     * 
     */
    public DECISION createDECISION() {
        return new DECISION();
    }

    /**
     * Create an instance of {@link CHMOD }
     * 
     */
    public CHMOD createCHMOD() {
        return new CHMOD();
    }

    /**
     * Create an instance of {@link END }
     * 
     */
    public END createEND() {
        return new END();
    }

    /**
     * Create an instance of {@link CREDENTIAL.Property }
     * 
     */
    public CREDENTIAL.Property createCREDENTIALProperty() {
        return new CREDENTIAL.Property();
    }

    /**
     * Create an instance of {@link CONFIGURATION.Property }
     * 
     */
    public CONFIGURATION.Property createCONFIGURATIONProperty() {
        return new CONFIGURATION.Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WORKFLOWAPP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "workflow-app")
    public JAXBElement<WORKFLOWAPP> createWorkflowApp(WORKFLOWAPP value) {
        return new JAXBElement<WORKFLOWAPP>(_WorkflowApp_QNAME, WORKFLOWAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SWITCH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "switch")
    public JAXBElement<SWITCH> createSwitch(SWITCH value) {
        return new JAXBElement<SWITCH>(_Switch_QNAME, SWITCH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAVA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "java")
    public JAXBElement<JAVA> createJava(JAVA value) {
        return new JAXBElement<JAVA>(_Java_QNAME, JAVA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUBWORKFLOW }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "sub-workflow")
    public JAXBElement<SUBWORKFLOW> createSubWorkflow(SUBWORKFLOW value) {
        return new JAXBElement<SUBWORKFLOW>(_SubWorkflow_QNAME, SUBWORKFLOW.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "fs")
    public JAXBElement<FS> createFs(FS value) {
        return new JAXBElement<FS>(_Fs_QNAME, FS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KILL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "kill")
    public JAXBElement<KILL> createKill(KILL value) {
        return new JAXBElement<KILL>(_Kill_QNAME, KILL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MAPREDUCE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "map-reduce")
    public JAXBElement<MAPREDUCE> createMapReduce(MAPREDUCE value) {
        return new JAXBElement<MAPREDUCE>(_MapReduce_QNAME, MAPREDUCE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:workflow:0.3", name = "pig")
    public JAXBElement<PIG> createPig(PIG value) {
        return new JAXBElement<PIG>(_Pig_QNAME, PIG.class, null, value);
    }

}