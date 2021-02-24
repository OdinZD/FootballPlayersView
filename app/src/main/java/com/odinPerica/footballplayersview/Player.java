package com.odinPerica.footballplayersview;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idPlayer",
        "idTeam",
        "idTeam2",
        "idTeamNational",
        "idSoccerXML",
        "idAPIfootball",
        "idPlayerManager",
        "strNationality",
        "strPlayer",
        "strTeam",
        "strTeam2",
        "strSport",
        "intSoccerXMLTeamID",
        "dateBorn",
        "strNumber",
        "dateSigned",
        "strSigning",
        "strWage",
        "strOutfitter",
        "strKit",
        "strAgent",
        "strBirthLocation",
        "strDescriptionEN",
        "strDescriptionDE",
        "strDescriptionFR",
        "strDescriptionCN",
        "strDescriptionIT",
        "strDescriptionJP",
        "strDescriptionRU",
        "strDescriptionES",
        "strDescriptionPT",
        "strDescriptionSE",
        "strDescriptionNL",
        "strDescriptionHU",
        "strDescriptionNO",
        "strDescriptionIL",
        "strDescriptionPL",
        "strGender",
        "strSide",
        "strPosition",
        "strCollege",
        "strFacebook",
        "strWebsite",
        "strTwitter",
        "strInstagram",
        "strYoutube",
        "strHeight",
        "strWeight",
        "intLoved",
        "strThumb",
        "strCutout",
        "strRender",
        "strBanner",
        "strFanart1",
        "strFanart2",
        "strFanart3",
        "strFanart4",
        "strCreativeCommons",
        "strLocked"
})
public class Player {

    @JsonProperty("idPlayer")
    private String idPlayer;
    @JsonProperty("idTeam")
    private String idTeam;
    @JsonProperty("idTeam2")
    private String idTeam2;
    @JsonProperty("idTeamNational")
    private Object idTeamNational;
    @JsonProperty("idSoccerXML")
    private String idSoccerXML;
    @JsonProperty("idAPIfootball")
    private String idAPIfootball;
    @JsonProperty("idPlayerManager")
    private Object idPlayerManager;
    @JsonProperty("strNationality")
    private String strNationality;
    @JsonProperty("strPlayer")
    private String strPlayer;
    @JsonProperty("strTeam")
    private String strTeam;
    @JsonProperty("strTeam2")
    private String strTeam2;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("intSoccerXMLTeamID")
    private String intSoccerXMLTeamID;
    @JsonProperty("dateBorn")
    private String dateBorn;
    @JsonProperty("strNumber")
    private String strNumber;
    @JsonProperty("dateSigned")
    private String dateSigned;
    @JsonProperty("strSigning")
    private String strSigning;
    @JsonProperty("strWage")
    private String strWage;
    @JsonProperty("strOutfitter")
    private String strOutfitter;
    @JsonProperty("strKit")
    private String strKit;
    @JsonProperty("strAgent")
    private String strAgent;
    @JsonProperty("strBirthLocation")
    private String strBirthLocation;
    @JsonProperty("strDescriptionEN")
    private String strDescriptionEN;
    @JsonProperty("strDescriptionDE")
    private Object strDescriptionDE;
    @JsonProperty("strDescriptionFR")
    private Object strDescriptionFR;
    @JsonProperty("strDescriptionCN")
    private Object strDescriptionCN;
    @JsonProperty("strDescriptionIT")
    private Object strDescriptionIT;
    @JsonProperty("strDescriptionJP")
    private Object strDescriptionJP;
    @JsonProperty("strDescriptionRU")
    private Object strDescriptionRU;
    @JsonProperty("strDescriptionES")
    private Object strDescriptionES;
    @JsonProperty("strDescriptionPT")
    private Object strDescriptionPT;
    @JsonProperty("strDescriptionSE")
    private Object strDescriptionSE;
    @JsonProperty("strDescriptionNL")
    private Object strDescriptionNL;
    @JsonProperty("strDescriptionHU")
    private Object strDescriptionHU;
    @JsonProperty("strDescriptionNO")
    private Object strDescriptionNO;
    @JsonProperty("strDescriptionIL")
    private Object strDescriptionIL;
    @JsonProperty("strDescriptionPL")
    private Object strDescriptionPL;
    @JsonProperty("strGender")
    private String strGender;
    @JsonProperty("strSide")
    private String strSide;
    @JsonProperty("strPosition")
    private String strPosition;
    @JsonProperty("strCollege")
    private Object strCollege;
    @JsonProperty("strFacebook")
    private String strFacebook;
    @JsonProperty("strWebsite")
    private String strWebsite;
    @JsonProperty("strTwitter")
    private String strTwitter;
    @JsonProperty("strInstagram")
    private String strInstagram;
    @JsonProperty("strYoutube")
    private String strYoutube;
    @JsonProperty("strHeight")
    private String strHeight;
    @JsonProperty("strWeight")
    private String strWeight;
    @JsonProperty("intLoved")
    private String intLoved;
    @JsonProperty("strThumb")
    private String strThumb;
    @JsonProperty("strCutout")
    private String strCutout;
    @JsonProperty("strRender")
    private String strRender;
    @JsonProperty("strBanner")
    private Object strBanner;
    @JsonProperty("strFanart1")
    private Object strFanart1;
    @JsonProperty("strFanart2")
    private Object strFanart2;
    @JsonProperty("strFanart3")
    private Object strFanart3;
    @JsonProperty("strFanart4")
    private Object strFanart4;
    @JsonProperty("strCreativeCommons")
    private String strCreativeCommons;
    @JsonProperty("strLocked")
    private String strLocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idPlayer")
    public String getIdPlayer() {
        return idPlayer;
    }

    @JsonProperty("idPlayer")
    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    @JsonProperty("idTeam")
    public String getIdTeam() {
        return idTeam;
    }

    @JsonProperty("idTeam")
    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    @JsonProperty("idTeam2")
    public String getIdTeam2() {
        return idTeam2;
    }

    @JsonProperty("idTeam2")
    public void setIdTeam2(String idTeam2) {
        this.idTeam2 = idTeam2;
    }

    @JsonProperty("idTeamNational")
    public Object getIdTeamNational() {
        return idTeamNational;
    }

    @JsonProperty("idTeamNational")
    public void setIdTeamNational(Object idTeamNational) {
        this.idTeamNational = idTeamNational;
    }

    @JsonProperty("idSoccerXML")
    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    @JsonProperty("idSoccerXML")
    public void setIdSoccerXML(String idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    @JsonProperty("idAPIfootball")
    public String getIdAPIfootball() {
        return idAPIfootball;
    }

    @JsonProperty("idAPIfootball")
    public void setIdAPIfootball(String idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    @JsonProperty("idPlayerManager")
    public Object getIdPlayerManager() {
        return idPlayerManager;
    }

    @JsonProperty("idPlayerManager")
    public void setIdPlayerManager(Object idPlayerManager) {
        this.idPlayerManager = idPlayerManager;
    }

    @JsonProperty("strNationality")
    public String getStrNationality() {
        return strNationality;
    }

    @JsonProperty("strNationality")
    public void setStrNationality(String strNationality) {
        this.strNationality = strNationality;
    }

    @JsonProperty("strPlayer")
    public String getStrPlayer() {
        return strPlayer;
    }

    @JsonProperty("strPlayer")
    public void setStrPlayer(String strPlayer) {
        this.strPlayer = strPlayer;
    }

    @JsonProperty("strTeam")
    public String getStrTeam() {
        return strTeam;
    }

    @JsonProperty("strTeam")
    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    @JsonProperty("strTeam2")
    public String getStrTeam2() {
        return strTeam2;
    }

    @JsonProperty("strTeam2")
    public void setStrTeam2(String strTeam2) {
        this.strTeam2 = strTeam2;
    }

    @JsonProperty("strSport")
    public String getStrSport() {
        return strSport;
    }

    @JsonProperty("strSport")
    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    @JsonProperty("intSoccerXMLTeamID")
    public String getIntSoccerXMLTeamID() {
        return intSoccerXMLTeamID;
    }

    @JsonProperty("intSoccerXMLTeamID")
    public void setIntSoccerXMLTeamID(String intSoccerXMLTeamID) {
        this.intSoccerXMLTeamID = intSoccerXMLTeamID;
    }

    @JsonProperty("dateBorn")
    public String getDateBorn() {
        return dateBorn;
    }

    @JsonProperty("dateBorn")
    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    @JsonProperty("strNumber")
    public String getStrNumber() {
        return strNumber;
    }

    @JsonProperty("strNumber")
    public void setStrNumber(String strNumber) {
        this.strNumber = strNumber;
    }

    @JsonProperty("dateSigned")
    public String getDateSigned() {
        return dateSigned;
    }

    @JsonProperty("dateSigned")
    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    @JsonProperty("strSigning")
    public String getStrSigning() {
        return strSigning;
    }

    @JsonProperty("strSigning")
    public void setStrSigning(String strSigning) {
        this.strSigning = strSigning;
    }

    @JsonProperty("strWage")
    public String getStrWage() {
        return strWage;
    }

    @JsonProperty("strWage")
    public void setStrWage(String strWage) {
        this.strWage = strWage;
    }

    @JsonProperty("strOutfitter")
    public String getStrOutfitter() {
        return strOutfitter;
    }

    @JsonProperty("strOutfitter")
    public void setStrOutfitter(String strOutfitter) {
        this.strOutfitter = strOutfitter;
    }

    @JsonProperty("strKit")
    public String getStrKit() {
        return strKit;
    }

    @JsonProperty("strKit")
    public void setStrKit(String strKit) {
        this.strKit = strKit;
    }

    @JsonProperty("strAgent")
    public String getStrAgent() {
        return strAgent;
    }

    @JsonProperty("strAgent")
    public void setStrAgent(String strAgent) {
        this.strAgent = strAgent;
    }

    @JsonProperty("strBirthLocation")
    public String getStrBirthLocation() {
        return strBirthLocation;
    }

    @JsonProperty("strBirthLocation")
    public void setStrBirthLocation(String strBirthLocation) {
        this.strBirthLocation = strBirthLocation;
    }

    @JsonProperty("strDescriptionEN")
    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    @JsonProperty("strDescriptionEN")
    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    @JsonProperty("strDescriptionDE")
    public Object getStrDescriptionDE() {
        return strDescriptionDE;
    }

    @JsonProperty("strDescriptionDE")
    public void setStrDescriptionDE(Object strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    @JsonProperty("strDescriptionFR")
    public Object getStrDescriptionFR() {
        return strDescriptionFR;
    }

    @JsonProperty("strDescriptionFR")
    public void setStrDescriptionFR(Object strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    @JsonProperty("strDescriptionCN")
    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    @JsonProperty("strDescriptionCN")
    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    @JsonProperty("strDescriptionIT")
    public Object getStrDescriptionIT() {
        return strDescriptionIT;
    }

    @JsonProperty("strDescriptionIT")
    public void setStrDescriptionIT(Object strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    @JsonProperty("strDescriptionJP")
    public Object getStrDescriptionJP() {
        return strDescriptionJP;
    }

    @JsonProperty("strDescriptionJP")
    public void setStrDescriptionJP(Object strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    @JsonProperty("strDescriptionRU")
    public Object getStrDescriptionRU() {
        return strDescriptionRU;
    }

    @JsonProperty("strDescriptionRU")
    public void setStrDescriptionRU(Object strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    @JsonProperty("strDescriptionES")
    public Object getStrDescriptionES() {
        return strDescriptionES;
    }

    @JsonProperty("strDescriptionES")
    public void setStrDescriptionES(Object strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    @JsonProperty("strDescriptionPT")
    public Object getStrDescriptionPT() {
        return strDescriptionPT;
    }

    @JsonProperty("strDescriptionPT")
    public void setStrDescriptionPT(Object strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    @JsonProperty("strDescriptionSE")
    public Object getStrDescriptionSE() {
        return strDescriptionSE;
    }

    @JsonProperty("strDescriptionSE")
    public void setStrDescriptionSE(Object strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    @JsonProperty("strDescriptionNL")
    public Object getStrDescriptionNL() {
        return strDescriptionNL;
    }

    @JsonProperty("strDescriptionNL")
    public void setStrDescriptionNL(Object strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    @JsonProperty("strDescriptionHU")
    public Object getStrDescriptionHU() {
        return strDescriptionHU;
    }

    @JsonProperty("strDescriptionHU")
    public void setStrDescriptionHU(Object strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    @JsonProperty("strDescriptionNO")
    public Object getStrDescriptionNO() {
        return strDescriptionNO;
    }

    @JsonProperty("strDescriptionNO")
    public void setStrDescriptionNO(Object strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    @JsonProperty("strDescriptionIL")
    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    @JsonProperty("strDescriptionIL")
    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    @JsonProperty("strDescriptionPL")
    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    @JsonProperty("strDescriptionPL")
    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    @JsonProperty("strGender")
    public String getStrGender() {
        return strGender;
    }

    @JsonProperty("strGender")
    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    @JsonProperty("strSide")
    public String getStrSide() {
        return strSide;
    }

    @JsonProperty("strSide")
    public void setStrSide(String strSide) {
        this.strSide = strSide;
    }

    @JsonProperty("strPosition")
    public String getStrPosition() {
        return strPosition;
    }

    @JsonProperty("strPosition")
    public void setStrPosition(String strPosition) {
        this.strPosition = strPosition;
    }

    @JsonProperty("strCollege")
    public Object getStrCollege() {
        return strCollege;
    }

    @JsonProperty("strCollege")
    public void setStrCollege(Object strCollege) {
        this.strCollege = strCollege;
    }

    @JsonProperty("strFacebook")
    public String getStrFacebook() {
        return strFacebook;
    }

    @JsonProperty("strFacebook")
    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    @JsonProperty("strWebsite")
    public String getStrWebsite() {
        return strWebsite;
    }

    @JsonProperty("strWebsite")
    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    @JsonProperty("strTwitter")
    public String getStrTwitter() {
        return strTwitter;
    }

    @JsonProperty("strTwitter")
    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    @JsonProperty("strInstagram")
    public String getStrInstagram() {
        return strInstagram;
    }

    @JsonProperty("strInstagram")
    public void setStrInstagram(String strInstagram) {
        this.strInstagram = strInstagram;
    }

    @JsonProperty("strYoutube")
    public String getStrYoutube() {
        return strYoutube;
    }

    @JsonProperty("strYoutube")
    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    @JsonProperty("strHeight")
    public String getStrHeight() {
        return strHeight;
    }

    @JsonProperty("strHeight")
    public void setStrHeight(String strHeight) {
        this.strHeight = strHeight;
    }

    @JsonProperty("strWeight")
    public String getStrWeight() {
        return strWeight;
    }

    @JsonProperty("strWeight")
    public void setStrWeight(String strWeight) {
        this.strWeight = strWeight;
    }

    @JsonProperty("intLoved")
    public String getIntLoved() {
        return intLoved;
    }

    @JsonProperty("intLoved")
    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    @JsonProperty("strThumb")
    public String getStrThumb() {
        return strThumb;
    }

    @JsonProperty("strThumb")
    public void setStrThumb(String strThumb) {
        this.strThumb = strThumb;
    }

    @JsonProperty("strCutout")
    public String getStrCutout() {
        return strCutout;
    }

    @JsonProperty("strCutout")
    public void setStrCutout(String strCutout) {
        this.strCutout = strCutout;
    }

    @JsonProperty("strRender")
    public String getStrRender() {
        return strRender;
    }

    @JsonProperty("strRender")
    public void setStrRender(String strRender) {
        this.strRender = strRender;
    }

    @JsonProperty("strBanner")
    public Object getStrBanner() {
        return strBanner;
    }

    @JsonProperty("strBanner")
    public void setStrBanner(Object strBanner) {
        this.strBanner = strBanner;
    }

    @JsonProperty("strFanart1")
    public Object getStrFanart1() {
        return strFanart1;
    }

    @JsonProperty("strFanart1")
    public void setStrFanart1(Object strFanart1) {
        this.strFanart1 = strFanart1;
    }

    @JsonProperty("strFanart2")
    public Object getStrFanart2() {
        return strFanart2;
    }

    @JsonProperty("strFanart2")
    public void setStrFanart2(Object strFanart2) {
        this.strFanart2 = strFanart2;
    }

    @JsonProperty("strFanart3")
    public Object getStrFanart3() {
        return strFanart3;
    }

    @JsonProperty("strFanart3")
    public void setStrFanart3(Object strFanart3) {
        this.strFanart3 = strFanart3;
    }

    @JsonProperty("strFanart4")
    public Object getStrFanart4() {
        return strFanart4;
    }

    @JsonProperty("strFanart4")
    public void setStrFanart4(Object strFanart4) {
        this.strFanart4 = strFanart4;
    }

    @JsonProperty("strCreativeCommons")
    public String getStrCreativeCommons() {
        return strCreativeCommons;
    }

    @JsonProperty("strCreativeCommons")
    public void setStrCreativeCommons(String strCreativeCommons) {
        this.strCreativeCommons = strCreativeCommons;
    }

    @JsonProperty("strLocked")
    public String getStrLocked() {
        return strLocked;
    }

    @JsonProperty("strLocked")
    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}