/*      */ package sun.awt.motif;
/*      */ 
/*      */ import java.nio.charset.Charset;
/*      */ import java.nio.charset.CharsetDecoder;
/*      */ import java.nio.charset.CharsetEncoder;
/*      */ import sun.nio.cs.ext.DoubleByteEncoder;
/*      */ 
/*      */ public class X11Johab extends Charset
/*      */ {
/*      */   public X11Johab()
/*      */   {
/*   35 */     super("X11Johab", null);
/*      */   }
/*      */ 
/*      */   public CharsetEncoder newEncoder() {
/*   39 */     return new Encoder(this);
/*      */   }
/*      */ 
/*      */   public CharsetDecoder newDecoder() {
/*   43 */     throw new Error("Decoder is not supported by X11Johab Charset");
/*      */   }
/*      */ 
/*      */   public boolean contains(Charset paramCharset) {
/*   47 */     return paramCharset instanceof X11GB18030_1;
/*      */   }
/*      */ 
/*      */   private static class Encoder extends DoubleByteEncoder
/*      */   {
/*      */     private static final String innerIndex0 = "";
/*      */     private static final String innerIndex1 = "";
/*      */     private static final String innerIndex2 = "";
/*      */     private static final String innerIndex3 = "";
/*      */     private static final String innerIndex4 = "";
/*      */     private static final String innerIndex5 = "";
/*      */     private static final String innerIndex6 = "";
/*      */     private static final String innerIndex7 = "麚麛麜麝麡麢麣麤麥麦麧麨麩麪麫麬麭麮麯麰麱麳麴麵麶麷麸麹麺麻麼麽黁黂黃黄黅黆黇黈黉黊黋黌黍黎黏黐黑黓黔黕黖黗默黙黚黛黜黝黡黢黣黤黥黦黧黨黩黪黫黬黭黮黯黰黱黳黴黵黶黷黸黹黺黻黼黽齁齂齃齄齅齆齇齈齉齊齋齌齍齎齏齐齑齓齔齕齖齗齘齙齚齛齜齝齡齢齣齤齥齦齧齨齩齪齫齬齭齮齯齰齱齳齴齵齶齷齸齹齺齻齼齽龁龂龃龄龅龆龇龈龉龊龋龌龍龎龏龐龑龓龔龕龖龗龘龙龚龛龜龝龡龢龣龤龥龦龧龨龩龪龫龬龭龮龯龰龱龳龴龵龶龷龸龹龺龻龼龽ꁡꁢꁣꁤꁥꁦꁧꁨꁩꁪꁫꁬꁭꁮꁯꁰꁱꁳꁴꁵꁶꁷꁸꁹꁺꁻꁼꁽꂁꂂꂃꂄꂅꂆꂇꂈꂉꂊꂋꂌꂍꂎꂏꂐꂑꂓꂔꂕꂖꂗꂘꂙꂚꂛꂜꂝꂡꂢꂣꂤꂥꂦꂧꂨꂩꂪꂫꂬꂭꂮꂯꂰꂱꂳꂴꂵꂶꂷꂸꂹꂺꂻꂼꂽꃁꃂꃃꃄꃅꃆꃇꃈꃉꃊꃋꃌꃍꃎꃏꃐꃑꃓꃔꃕꃖꃗꃘꃙꃚꃛꃜꃝꃡꃢꃣꃤꃥꃦꃧꃨꃩꃪꃫꃬꃭꃮꃯꃰꃱꃳꃴꃵꃶꃷꃸꃹꃺꃻꃼꃽꅁꅂꅃꅄꅅꅆꅇꅈꅉꅊꅋꅌꅍꅎꅏꅐꅑꅓꅔꅕꅖꅗꅘꅙꅚꅛꅜꅝꅡꅢꅣꅤꅥꅦꅧꅨꅩꅪꅫꅬꅭꅮꅯꅰꅱꅳꅴꅵꅶꅷꅸꅹꅺꅻꅼꅽꆁꆂꆃꆄꆅꆆꆇꆈꆉꆊꆋꆌꆍꆎꆏꆐꆑꆓꆔꆕꆖꆗꆘꆙꆚꆛꆜꆝꆡꆢꆣꆤꆥꆦꆧꆨꆩꆪꆫꆬꆭꆮꆯꆰꆱꆳꆴꆵꆶꆷꆸꆹꆺꆻꆼꆽꇁꇂꇃꇄꇅꇆꇇꇈꇉꇊꇋꇌꇍꇎꇏꇐꇑꇓꇔꇕꇖꇗꇘꇙꇚꇛꇜꇝꇡꇢꇣꇤꇥꇦꇧꇨꇩꇪꇫꇬꇭꇮꇯꇰꇱꇳꇴꇵꇶꇷꇸꇹꇺꇻꇼꇽꉁꉂꉃꉄꉅꉆꉇꉈꉉꉊꉋꉌꉍꉎꉏꉐꉑꉓꉔꉕꉖꉗꉘꉙꉚꉛꉜꉝꉡꉢꉣꉤꉥꉦꉧꉨꉩꉪꉫꉬꉭꉮꉯꉰꉱꉳꉴꉵꉶꉷꉸꉹꉺꉻꉼꉽꊁꊂꊃꊄꊅꊆꊇꊈꊉꊊꊋꊌꊍꊎꊏꊐꊑꊓꊔꊕꊖꊗꊘꊙꊚꊛꊜꊝꊡꊢꊣꊤꊥꊦꊧꊨꊩꊪꊫꊬꊭꊮꊯꊰꊱꊳꊴꊵꊶꊷꊸꊹꊺꊻꊼꊽꋁꋂꋃꋄꋅꋆꋇꋈꋉꋊꋋꋌꋍꋎꋏꋐꋑꋓꋔꋕꋖꋗꋘꋙꋚꋛꋜꋝꋡꋢꋣꋤꋥꋦꋧꋨꋩꋪꋫꋬꋭꋮꋯꋰꋱꋳꋴꋵꋶꋷꋸꋹꋺꋻꋼꋽꍁꍂꍃꍄꍅꍆꍇꍈꍉꍊꍋꍌꍍꍎꍏꍐꍑꍓꍔꍕꍖꍗꍘꍙꍚꍛꍜꍝꍡꍢꍣꍤꍥꍦꍧꍨꍩꍪꍫꍬꍭꍮꍯꍰꍱꍳꍴꍵꍶꍷꍸꍹꍺꍻꍼꍽꎁꎂꎃꎄꎅꎆꎇꎈꎉꎊꎋꎌꎍꎎꎏꎐꎑꎓꎔꎕꎖꎗꎘꎙꎚꎛꎜꎝꎡꎢꎣꎤꎥꎦꎧꎨꎩꎪꎫꎬꎭꎮꎯꎰꎱꎳꎴꎵꎶꎷꎸꎹꎺꎻꎼꎽꑡꑢꑣꑤꑥꑦꑧꑨꑩꑪꑫꑬꑭꑮꑯꑰꑱꑳꑴꑵꑶꑷꑸꑹꑺꑻꑼꑽꒁꒂꒃꒄꒅꒆꒇꒈꒉꒊꒋꒌ꒍꒎꒏꒐꒑꒓꒔꒕꒖꒗꒘꒙꒚꒛꒜꒝꒡꒢꒣꒤꒥꒦꒧꒨꒩꒪꒫꒬꒭꒮꒯꒰꒱꒳꒴꒵꒶꒷꒸꒹꒺꒻꒼꒽꓁꓂꓃꓄꓅꓆꓇꓈꓉꓊꓋꓌꓍꓎꓏ꓐꓑꓓꓔꓕꓖꓗꓘꓙꓚꓛꓜꓝꓡꓢꓣꓤꓥꓦꓧꓨꓩꓪꓫꓬꓭꓮꓯꓰꓱꓳꓴꓵꓶꓷꓸꓹꓺꓻꓼꓽꕁꕂꕃꕄꕅꕆꕇꕈꕉꕊꕋꕌꕍꕎꕏꕐꕑꕓꕔꕕꕖꕗꕘꕙꕚꕛꕜꕝꕡꕢꕣꕤꕥꕦꕧꕨꕩꕪꕫꕬꕭꕮꕯꕰꕱꕳꕴꕵꕶꕷꕸꕹꕺꕻꕼꕽꖁꖂꖃꖄꖅꖆꖇꖈꖉꖊꖋꖌꖍꖎꖏꖐꖑꖓꖔꖕꖖꖗꖘꖙꖚꖛꖜꖝꖡꖢꖣꖤꖥꖦꖧꖨꖩꖪꖫꖬꖭꖮꖯꖰꖱꖳꖴꖵꖶꖷꖸꖹꖺꖻꖼꖽꗁꗂꗃꗄꗅꗆꗇꗈꗉꗊꗋꗌꗍꗎꗏꗐꗑꗓꗔꗕꗖꗗꗘꗙꗚꗛꗜꗝꗡꗢꗣꗤꗥꗦꗧꗨꗩꗪꗫꗬꗭꗮꗯꗰꗱꗳꗴꗵꗶꗷꗸꗹꗺꗻꗼꗽꙁꙂꙃꙄꙅꙆꙇꙈꙉꙊꙋꙌꙍꙎꙏꙐꙑꙓꙔꙕꙖꙗꙘꙙꙚꙛꙜꙝꙡꙢꙣꙤꙥꙦꙧꙨꙩꙪꙫꙬꙭꙮ꙯꙰꙱꙳ꙴꙵꙶꙷꙸꙹꙺꙻ꙼꙽ꚁꚂꚃꚄꚅꚆꚇꚈꚉꚊꚋꚌꚍꚎꚏꚐꚑꚓꚔꚕꚖꚗꚘꚙꚚꚛꚜꚝꚡꚢꚣꚤꚥꚦꚧꚨꚩꚪꚫꚬꚭꚮꚯꚰꚱꚳꚴꚵꚶꚷꚸꚹꚺꚻꚼꚽꛁꛂꛃꛄꛅꛆꛇꛈꛉꛊꛋꛌꛍꛎꛏꛐꛑꛓꛔꛕꛖꛗꛘꛙꛚꛛꛜꛝꛡꛢꛣꛤꛥꛦꛧꛨꛩꛪꛫꛬꛭꛮꛯ꛰꛱꛳꛴꛵꛶꛷꛸꛹꛺꛻꛼꛽ꝁꝂꝃꝄꝅꝆꝇꝈꝉꝊꝋꝌꝍꝎꝏꝐꝑꝓꝔꝕꝖꝗꝘꝙꝚꝛꝜꝝꝡꝢꝣꝤꝥꝦꝧꝨꝩꝪꝫꝬꝭꝮꝯꝰꝱꝳꝴꝵꝶꝷꝸꝹꝺꝻꝼꝽꞁꞂꞃꞄꞅꞆꞇꞈ꞉꞊ꞋꞌꞍꞎꞏꞐꞑꞓꞔꞕꞖꞗꞘꞙꞚꞛꞜꞝꞡꞢꞣꞤꞥꞦꞧꞨꞩꞪꞫꞬꞭꞮꞯꞰꞱꞳꞴꞵꞶꞷꞸꞹꞺꞻꞼꞽꡡꡢꡣꡤꡥꡦꡧꡨꡩꡪꡫꡬꡭꡮꡯꡰꡱꡳ꡴꡵꡶꡷꡸꡹꡺꡻꡼꡽ꢁꢂꢃꢄꢅꢆꢇꢈꢉꢊꢋꢌꢍꢎꢏꢐꢑꢓꢔꢕꢖꢗꢘꢙꢚꢛꢜꢝꢡꢢꢣꢤꢥꢦꢧꢨꢩꢪꢫꢬꢭꢮꢯꢰꢱꢳꢴꢵꢶꢷꢸꢹꢺꢻꢼꢽꣁꣂꣃ꣄ꣅ꣆꣇꣈꣉꣊꣋꣌꣍꣎꣏꣐꣑꣓꣔꣕꣖꣗꣘꣙꣚꣛꣜꣝꣡꣢꣣꣤꣥꣦꣧꣨꣩꣪꣫꣬꣭꣮꣯꣰꣱ꣳꣴꣵꣶꣷ꣸꣹꣺ꣻ꣼ꣽꥁꥂꥃꥄꥅꥆꥇꥈꥉꥊꥋꥌꥍꥎꥏꥐꥑ꥓꥔꥕꥖꥗꥘꥙꥚꥛꥜꥝ꥡꥢꥣꥤꥥꥦꥧꥨꥩꥪꥫꥬꥭꥮꥯꥰꥱꥳꥴꥵꥶꥷꥸꥹꥺꥻꥼ꥽ꦁꦂꦃꦄꦅꦆꦇꦈꦉꦊꦋꦌꦍꦎꦏꦐꦑꦓꦔꦕꦖꦗꦘꦙꦚꦛꦜꦝꦡꦢꦣꦤꦥꦦꦧꦨꦩꦪꦫꦬꦭꦮꦯꦰꦱ꦳ꦴꦵꦶꦷꦸꦹꦺꦻꦼꦽ꧁꧂꧃꧄꧅꧆꧇꧈꧉꧊꧋꧌꧍꧎ꧏ꧐꧑꧓꧔꧕꧖꧗꧘꧙꧚꧛꧜꧝ꧡꧢꧣꧤꧥꧦꧧꧨꧩꧪꧫꧬꧭꧮꧯ꧰꧱꧳꧴꧵꧶꧷꧸꧹ꧺꧻꧼꧽꩁꩂꩃꩄꩅꩆꩇꩈꩉꩊꩋꩌꩍ꩎꩏꩐꩑꩓꩔꩕꩖꩗꩘꩙꩚꩛꩜꩝ꩡꩢꩣꩤꩥꩦꩧꩨꩩꩪꩫꩬꩭꩮꩯꩰꩱꩳꩴꩵꩶ꩷꩸꩹ꩺꩻꩼꩽꪁꪂꪃꪄꪅꪆꪇꪈꪉꪊꪋꪌꪍꪎꪏꪐꪑꪓꪔꪕꪖꪗꪘꪙꪚꪛꪜꪝꪡꪢꪣꪤꪥꪦꪧꪨꪩꪪꪫꪬꪭꪮꪯꪰꪱꪴꪳꪵꪶꪷꪸꪹꪺꪻꪼꪽ꫁ꫂ꫃꫄꫅꫆꫇꫈꫉꫊꫋꫌꫍꫎꫏꫐꫑꫓꫔꫕꫖꫗꫘꫙꫚ꫛꫜꫝꫡꫢꫣꫤꫥꫦꫧꫨꫩꫪꫫꫬꫭꫮꫯ꫰꫱ꫳꫴꫵ꫶꫷꫸꫹꫺꫻꫼꫽ꭁꭂꭃꭄꭅꭆꭇꭈꭉꭊꭋꭌꭍꭎꭏꭐꭑꭓꭔꭕꭖꭗꭘꭙꭚ꭛ꭜꭝꭡꭢꭣꭤꭥꭦꭧꭨꭩ꭪꭫꭬꭭꭮꭯ꭰꭱꭳꭴꭵꭶꭷꭸꭹꭺꭻꭼꭽꮁꮂꮃꮄꮅꮆꮇꮈꮉꮊꮋꮌꮍꮎꮏꮐꮑꮓꮔꮕꮖꮗꮘꮙꮚꮛꮜꮝꮡꮢꮣꮤꮥꮦꮧꮨꮩꮪꮫꮬꮭꮮꮯꮰꮱꮳꮴꮵꮶꮷꮸꮹꮺꮻꮼꮽ걡걢걣걤걥걦걧걨걩걪걫걬걭걮걯거걱걳건걵걶걷걸걹걺걻걼걽겁겂것겄겅겆겇겈겉겊겋게겍겎겏겐겑겓겔겕겖겗겘겙겚겛겜겝겡겢겣겤겥겦겧겨격겪겫견겭겮겯결겱겳겴겵겶겷겸겹겺겻겼경곁곂곃계곅곆곇곈곉곊곋곌곍곎곏곐곑곓곔곕곖곗곘곙곚곛곜곝곡곢곣곤곥곦곧골곩곪곫곬곭곮곯곰곱곳곴공곶곷곸곹곺곻과곽굁굂굃굄굅굆굇굈굉굊굋굌굍굎굏교굑굓굔굕굖굗굘굙굚굛굜굝굡굢굣굤굥굦굧굨굩굪굫구국굮굯군굱굳굴굵굶굷굸굹굺굻굼굽궁궂궃궄궅궆궇궈궉궊궋권궍궎궏궐궑궓궔궕궖궗궘궙궚궛궜궝궡궢궣궤궥궦궧궨궩궪궫궬궭궮궯궰궱궳궴궵궶궷궸궹궺궻궼궽귁귂귃귄귅귆귇귈귉귊귋귌귍귎귏귐귑귓귔귕귖귗귘귙귚귛규귝귡귢귣귤귥귦귧귨귩귪귫귬귭귮귯귰귱귳귴귵귶귷그극귺귻근귽깁깂깃깄깅깆깇깈깉깊깋까깍깎깏깐깑깓깔깕깖깗깘깙깚깛깜깝깡깢깣깤깥깦깧깨깩깪깫깬깭깮깯깰깱깳깴깵깶깷깸깹깺깻깼깽꺁꺂꺃꺄꺅꺆꺇꺈꺉꺊꺋꺌꺍꺎꺏꺐꺑꺓꺔꺕꺖꺗꺘꺙꺚꺛꺜꺝꺡꺢꺣꺤꺥꺦꺧꺨꺩꺪꺫꺬꺭꺮꺯꺰꺱꺳꺴꺵꺶꺷꺸꺹꺺꺻꺼꺽껁껂껃껄껅껆껇껈껉껊껋껌껍껎껏껐껑껓껔껕껖껗께껙껚껛껜껝껡껢껣껤껥껦껧껨껩껪껫껬껭껮껯껰껱껳껴껵껶껷껸껹껺껻껼껽꽁꽂꽃꽄꽅꽆꽇꽈꽉꽊꽋꽌꽍꽎꽏꽐꽑꽓꽔꽕꽖꽗꽘꽙꽚꽛꽜꽝꽡꽢꽣꽤꽥꽦꽧꽨꽩꽪꽫꽬꽭꽮꽯꽰꽱꽳꽴꽵꽶꽷꽸꽹꽺꽻꽼꽽꾁꾂꾃꾄꾅꾆꾇꾈꾉꾊꾋꾌꾍꾎꾏꾐꾑꾓꾔꾕꾖꾗꾘꾙꾚꾛꾜꾝꾡꾢꾣꾤꾥꾦꾧꾨꾩꾪꾫꾬꾭꾮꾯꾰꾱꾳꾴꾵꾶꾷꾸꾹꾺꾻꾼꾽끡끢끣끤끥끦끧끨끩끪끫끬끭끮끯끰끱끳끴끵끶끷끸끹끺끻끼끽낁낂낃낄낅낆낇낈낉낊낋낌낍낎낏낐낑낓낔낕낖낗나낙낚낛난낝낡낢낣낤낥낦낧남납낪낫났낭낮낯낰낱낳내낵낶낷낸낹낺낻낼낽냁냂냃냄냅냆냇냈냉냊냋냌냍냎냏냐냑냓냔냕냖냗냘냙냚냛냜냝냡냢냣냤냥냦냧냨냩냪냫냬냭냮냯냰냱냳냴냵냶냷냸냹냺냻냼냽녁녂녃년녅녆녇녈녉녊녋녌녍녎녏념녑녓녔녕녖녗녘녙녚녛녜녝녡녢녣녤녥녦녧녨녩녪녫녬녭녮녯녰녱녳녴녵녶녷노녹녺녻논녽놁놂놃놄놅놆놇놈놉놊놋놌농놎놏놐놑놓놔놕놖놗놘놙놚놛놜놝놡놢놣놤놥놦놧놨놩놪놫놬놭놮놯놰놱놳놴놵놶놷놸놹놺놻놼놽뇁뇂뇃뇄뇅뇆뇇뇈뇉뇊뇋뇌뇍뇎뇏뇐뇑뇓뇔뇕뇖뇗뇘뇙뇚뇛뇜뇝뇡뇢뇣뇤뇥뇦뇧뇨뇩뇪뇫뇬뇭뇮뇯뇰뇱뇳뇴뇵뇶뇷뇸뇹뇺뇻뇼뇽뉁뉂뉃뉄뉅뉆뉇뉈뉉뉊뉋뉌뉍뉎뉏뉐뉑뉓뉔뉕뉖뉗뉘뉙뉚뉛뉜뉝뉡뉢뉣뉤뉥뉦뉧뉨뉩뉪뉫뉬뉭뉮뉯뉰뉱뉳뉴뉵뉶뉷뉸뉹뉺뉻뉼뉽늁늂늃늄늅늆늇늈늉늊늋늌늍늎늏느늑늓는늕늖늗늘늙늚늛늜늝늡늢늣늤능늦늧늨늩늪늫늬늭늮늯늰늱늳늴늵늶늷늸늹늺늻늼늽닁닂닃닄닅닆닇니닉닊닋닌닍닎닏닐닑닓닔닕닖닗님닙닚닛닜닝닡닢닣다닥닦닧단닩닪닫달닭닮닯닰닱닳담답닶닷닸당닺닻닼닽덁덂덃덄덅덆덇덈덉덊덋덌덍덎덏덐덑덓더덕덖덗던덙덚덛덜덝덡덢덣덤덥덦덧덨덩덪덫덬덭덮덯데덱덳덴덵덶덷델덹덺덻덼덽뎁뎂뎃뎄뎅뎆뎇뎈뎉뎊뎋뎌뎍뎎뎏뎐뎑뎓뎔뎕뎖뎗뎘뎙뎚뎛뎜뎝뎡뎢뎣뎤뎥뎦뎧뎨뎩뎪뎫뎬뎭뎮뎯뎰뎱뎳뎴뎵뎶뎷뎸뎹뎺뎻뎼뎽둡둢둣둤둥둦둧둨둩둪둫둬둭둮둯둰둱둳둴둵둶둷둸둹둺둻둼둽뒁뒂뒃뒄뒅뒆뒇뒈뒉뒊뒋뒌뒍뒎뒏뒐뒑뒓뒔뒕뒖뒗뒘뒙뒚뒛뒜뒝뒡뒢뒣뒤뒥뒦뒧뒨뒩뒪뒫뒬뒭뒮뒯뒰뒱뒳뒴뒵뒶뒷뒸뒹뒺뒻뒼뒽듁듂듃듄듅듆듇듈듉듊듋듌듍듎듏듐듑듓듔듕듖듗듘듙듚듛드득듡듢듣들듥듦듧듨듩듪듫듬듭듮듯듰등듳듴듵듶듷듸듹듺듻듼듽땁땂땃땄땅땆땇땈땉땊땋때땍땎땏땐땑땓땔땕땖땗땘땙땚땛땜땝땡땢땣땤땥땦땧땨땩땪땫땬땭땮땯땰땱땳땴땵땶땷땸땹땺땻땼땽떁떂떃떄떅떆떇떈떉떊떋떌떍떎떏떐떑떓떔떕떖떗떘떙떚떛떜떝떡떢떣떤떥떦떧떨떩떪떫떬떭떮떯떰떱떳떴떵떶떷떸떹떺떻떼떽뗁뗂뗃뗄뗅뗆뗇뗈뗉뗊뗋뗌뗍뗎뗏뗐뗑뗓뗔뗕뗖뗗뗘뗙뗚뗛뗜뗝뗡뗢뗣뗤뗥뗦뗧뗨뗩뗪뗫뗬뗭뗮뗯뗰뗱뗳뗴뗵뗶뗷뗸뗹뗺뗻뗼뗽뙁뙂뙃뙄뙅뙆뙇뙈뙉뙊뙋뙌뙍뙎뙏뙐뙑뙓뙔뙕뙖뙗뙘뙙뙚뙛뙜뙝뙡뙢뙣뙤뙥뙦뙧뙨뙩뙪뙫뙬뙭뙮뙯뙰뙱뙳뙴뙵뙶뙷뙸뙹뙺뙻뙼뙽뚁뚂뚃뚄뚅뚆뚇뚈뚉뚊뚋뚌뚍뚎뚏뚐뚑뚓뚔뚕뚖뚗뚘뚙뚚뚛뚜뚝뚡뚢뚣뚤뚥뚦뚧뚨뚩뚪뚫뚬뚭뚮뚯뚰뚱뚳뚴뚵뚶뚷뚸뚹뚺뚻뚼뚽뛁뛂뛃뛄뛅뛆뛇뛈뛉뛊뛋뛌뛍뛎뛏뛐뛑뛓뛔뛕뛖뛗뛘뛙뛚뛛뛜뛝뛡뛢뛣뛤뛥뛦뛧뛨뛩뛪뛫뛬뛭뛮뛯뛰뛱뛳뛴뛵뛶뛷뛸뛹뛺뛻뛼뛽띁띂띃띄띅띆띇띈띉띊띋띌띍띎띏띐띑띓띔띕띖띗띘띙띚띛띜띝띡띢띣띤띥띦띧띨띩띪띫띬띭띮띯띰띱띳띴띵띶띷띸띹띺띻라락랁랂랃랄랅랆랇랈랉랊랋람랍랎랏랐랑랓랔랕랖랗래랙랚랛랜랝랡랢랣랤랥랦랧램랩랪랫랬랭랮랯랰랱랳랴략랶랷랸랹랺랻랼랽롡롢롣롤롥롦롧롨롩롪롫롬롭롮롯롰롱롳롴롵롶롷롸롹롺롻롼롽뢁뢂뢃뢄뢅뢆뢇뢈뢉뢊뢋뢌뢍뢎뢏뢐뢑뢓뢔뢕뢖뢗뢘뢙뢚뢛뢜뢝뢡뢢뢣뢤뢥뢦뢧뢨뢩뢪뢫뢬뢭뢮뢯뢰뢱뢳뢴뢵뢶뢷뢸뢹뢺뢻뢼뢽룁룂룃룄룅룆룇룈룉룊룋료룍룎룏룐룑룓룔룕룖룗룘룙룚룛룜룝룡룢룣룤룥룦룧루룩룪룫룬룭룮룯룰룱룳룴룵룶룷룸룹룺룻룼룽륁륂륃륄륅륆륇륈륉륊륋륌륍륎륏륐륑륓륔륕륖륗류륙륚륛륜륝륡륢륣륤륥륦륧륨륩륪륫륬륭륮륯륰륱륳르륵륶륷른륹륺륻를륽릁릂릃름릅릆릇릈릉릊릋릌릍릎릏릐릑릓릔릕릖릗릘릙릚릛릜릝릡릢릣릤릥릦릧릨릩릪릫리릭릮릯린릱릳릴릵릶릷릸릹릺릻림립링맂맃맄맅맆맇마막맊맋만맍많맏말맑맓맔맕맖맗맘맙맚맛맜망맡맢맣매맥맦맧맨맩맪맫맬맭맮맯맰맱맳맴맵맶맷맸맹맺맻맼맽멁멂멃멄멅멆멇멈멉멊멋멌멍멎멏멐멑멓메멕멖멗멘멙멚멛멜멝멡멢멣멤멥멦멧멨멩멪멫멬멭멮멯며멱멳면멵멶멷멸멹멺멻멼멽몁몂몃몄";
/*      */     private static final String innerIndex8 = "";
/*      */     private static final String innerIndex9 = "";
/* 4751 */     private static final short[] index1 = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 14, 15, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 143, 144, 0, 0, 0, 0, 145 };
/*      */ 
/* 4770 */     private static String[] index2 = { "", "", "", "", "", "", "", "麚麛麜麝麡麢麣麤麥麦麧麨麩麪麫麬麭麮麯麰麱麳麴麵麶麷麸麹麺麻麼麽黁黂黃黄黅黆黇黈黉黊黋黌黍黎黏黐黑黓黔黕黖黗默黙黚黛黜黝黡黢黣黤黥黦黧黨黩黪黫黬黭黮黯黰黱黳黴黵黶黷黸黹黺黻黼黽齁齂齃齄齅齆齇齈齉齊齋齌齍齎齏齐齑齓齔齕齖齗齘齙齚齛齜齝齡齢齣齤齥齦齧齨齩齪齫齬齭齮齯齰齱齳齴齵齶齷齸齹齺齻齼齽龁龂龃龄龅龆龇龈龉龊龋龌龍龎龏龐龑龓龔龕龖龗龘龙龚龛龜龝龡龢龣龤龥龦龧龨龩龪龫龬龭龮龯龰龱龳龴龵龶龷龸龹龺龻龼龽ꁡꁢꁣꁤꁥꁦꁧꁨꁩꁪꁫꁬꁭꁮꁯꁰꁱꁳꁴꁵꁶꁷꁸꁹꁺꁻꁼꁽꂁꂂꂃꂄꂅꂆꂇꂈꂉꂊꂋꂌꂍꂎꂏꂐꂑꂓꂔꂕꂖꂗꂘꂙꂚꂛꂜꂝꂡꂢꂣꂤꂥꂦꂧꂨꂩꂪꂫꂬꂭꂮꂯꂰꂱꂳꂴꂵꂶꂷꂸꂹꂺꂻꂼꂽꃁꃂꃃꃄꃅꃆꃇꃈꃉꃊꃋꃌꃍꃎꃏꃐꃑꃓꃔꃕꃖꃗꃘꃙꃚꃛꃜꃝꃡꃢꃣꃤꃥꃦꃧꃨꃩꃪꃫꃬꃭꃮꃯꃰꃱꃳꃴꃵꃶꃷꃸꃹꃺꃻꃼꃽꅁꅂꅃꅄꅅꅆꅇꅈꅉꅊꅋꅌꅍꅎꅏꅐꅑꅓꅔꅕꅖꅗꅘꅙꅚꅛꅜꅝꅡꅢꅣꅤꅥꅦꅧꅨꅩꅪꅫꅬꅭꅮꅯꅰꅱꅳꅴꅵꅶꅷꅸꅹꅺꅻꅼꅽꆁꆂꆃꆄꆅꆆꆇꆈꆉꆊꆋꆌꆍꆎꆏꆐꆑꆓꆔꆕꆖꆗꆘꆙꆚꆛꆜꆝꆡꆢꆣꆤꆥꆦꆧꆨꆩꆪꆫꆬꆭꆮꆯꆰꆱꆳꆴꆵꆶꆷꆸꆹꆺꆻꆼꆽꇁꇂꇃꇄꇅꇆꇇꇈꇉꇊꇋꇌꇍꇎꇏꇐꇑꇓꇔꇕꇖꇗꇘꇙꇚꇛꇜꇝꇡꇢꇣꇤꇥꇦꇧꇨꇩꇪꇫꇬꇭꇮꇯꇰꇱꇳꇴꇵꇶꇷꇸꇹꇺꇻꇼꇽꉁꉂꉃꉄꉅꉆꉇꉈꉉꉊꉋꉌꉍꉎꉏꉐꉑꉓꉔꉕꉖꉗꉘꉙꉚꉛꉜꉝꉡꉢꉣꉤꉥꉦꉧꉨꉩꉪꉫꉬꉭꉮꉯꉰꉱꉳꉴꉵꉶꉷꉸꉹꉺꉻꉼꉽꊁꊂꊃꊄꊅꊆꊇꊈꊉꊊꊋꊌꊍꊎꊏꊐꊑꊓꊔꊕꊖꊗꊘꊙꊚꊛꊜꊝꊡꊢꊣꊤꊥꊦꊧꊨꊩꊪꊫꊬꊭꊮꊯꊰꊱꊳꊴꊵꊶꊷꊸꊹꊺꊻꊼꊽꋁꋂꋃꋄꋅꋆꋇꋈꋉꋊꋋꋌꋍꋎꋏꋐꋑꋓꋔꋕꋖꋗꋘꋙꋚꋛꋜꋝꋡꋢꋣꋤꋥꋦꋧꋨꋩꋪꋫꋬꋭꋮꋯꋰꋱꋳꋴꋵꋶꋷꋸꋹꋺꋻꋼꋽꍁꍂꍃꍄꍅꍆꍇꍈꍉꍊꍋꍌꍍꍎꍏꍐꍑꍓꍔꍕꍖꍗꍘꍙꍚꍛꍜꍝꍡꍢꍣꍤꍥꍦꍧꍨꍩꍪꍫꍬꍭꍮꍯꍰꍱꍳꍴꍵꍶꍷꍸꍹꍺꍻꍼꍽꎁꎂꎃꎄꎅꎆꎇꎈꎉꎊꎋꎌꎍꎎꎏꎐꎑꎓꎔꎕꎖꎗꎘꎙꎚꎛꎜꎝꎡꎢꎣꎤꎥꎦꎧꎨꎩꎪꎫꎬꎭꎮꎯꎰꎱꎳꎴꎵꎶꎷꎸꎹꎺꎻꎼꎽꑡꑢꑣꑤꑥꑦꑧꑨꑩꑪꑫꑬꑭꑮꑯꑰꑱꑳꑴꑵꑶꑷꑸꑹꑺꑻꑼꑽꒁꒂꒃꒄꒅꒆꒇꒈꒉꒊꒋꒌ꒍꒎꒏꒐꒑꒓꒔꒕꒖꒗꒘꒙꒚꒛꒜꒝꒡꒢꒣꒤꒥꒦꒧꒨꒩꒪꒫꒬꒭꒮꒯꒰꒱꒳꒴꒵꒶꒷꒸꒹꒺꒻꒼꒽꓁꓂꓃꓄꓅꓆꓇꓈꓉꓊꓋꓌꓍꓎꓏ꓐꓑꓓꓔꓕꓖꓗꓘꓙꓚꓛꓜꓝꓡꓢꓣꓤꓥꓦꓧꓨꓩꓪꓫꓬꓭꓮꓯꓰꓱꓳꓴꓵꓶꓷꓸꓹꓺꓻꓼꓽꕁꕂꕃꕄꕅꕆꕇꕈꕉꕊꕋꕌꕍꕎꕏꕐꕑꕓꕔꕕꕖꕗꕘꕙꕚꕛꕜꕝꕡꕢꕣꕤꕥꕦꕧꕨꕩꕪꕫꕬꕭꕮꕯꕰꕱꕳꕴꕵꕶꕷꕸꕹꕺꕻꕼꕽꖁꖂꖃꖄꖅꖆꖇꖈꖉꖊꖋꖌꖍꖎꖏꖐꖑꖓꖔꖕꖖꖗꖘꖙꖚꖛꖜꖝꖡꖢꖣꖤꖥꖦꖧꖨꖩꖪꖫꖬꖭꖮꖯꖰꖱꖳꖴꖵꖶꖷꖸꖹꖺꖻꖼꖽꗁꗂꗃꗄꗅꗆꗇꗈꗉꗊꗋꗌꗍꗎꗏꗐꗑꗓꗔꗕꗖꗗꗘꗙꗚꗛꗜꗝꗡꗢꗣꗤꗥꗦꗧꗨꗩꗪꗫꗬꗭꗮꗯꗰꗱꗳꗴꗵꗶꗷꗸꗹꗺꗻꗼꗽꙁꙂꙃꙄꙅꙆꙇꙈꙉꙊꙋꙌꙍꙎꙏꙐꙑꙓꙔꙕꙖꙗꙘꙙꙚꙛꙜꙝꙡꙢꙣꙤꙥꙦꙧꙨꙩꙪꙫꙬꙭꙮ꙯꙰꙱꙳ꙴꙵꙶꙷꙸꙹꙺꙻ꙼꙽ꚁꚂꚃꚄꚅꚆꚇꚈꚉꚊꚋꚌꚍꚎꚏꚐꚑꚓꚔꚕꚖꚗꚘꚙꚚꚛꚜꚝꚡꚢꚣꚤꚥꚦꚧꚨꚩꚪꚫꚬꚭꚮꚯꚰꚱꚳꚴꚵꚶꚷꚸꚹꚺꚻꚼꚽꛁꛂꛃꛄꛅꛆꛇꛈꛉꛊꛋꛌꛍꛎꛏꛐꛑꛓꛔꛕꛖꛗꛘꛙꛚꛛꛜꛝꛡꛢꛣꛤꛥꛦꛧꛨꛩꛪꛫꛬꛭꛮꛯ꛰꛱꛳꛴꛵꛶꛷꛸꛹꛺꛻꛼꛽ꝁꝂꝃꝄꝅꝆꝇꝈꝉꝊꝋꝌꝍꝎꝏꝐꝑꝓꝔꝕꝖꝗꝘꝙꝚꝛꝜꝝꝡꝢꝣꝤꝥꝦꝧꝨꝩꝪꝫꝬꝭꝮꝯꝰꝱꝳꝴꝵꝶꝷꝸꝹꝺꝻꝼꝽꞁꞂꞃꞄꞅꞆꞇꞈ꞉꞊ꞋꞌꞍꞎꞏꞐꞑꞓꞔꞕꞖꞗꞘꞙꞚꞛꞜꞝꞡꞢꞣꞤꞥꞦꞧꞨꞩꞪꞫꞬꞭꞮꞯꞰꞱꞳꞴꞵꞶꞷꞸꞹꞺꞻꞼꞽꡡꡢꡣꡤꡥꡦꡧꡨꡩꡪꡫꡬꡭꡮꡯꡰꡱꡳ꡴꡵꡶꡷꡸꡹꡺꡻꡼꡽ꢁꢂꢃꢄꢅꢆꢇꢈꢉꢊꢋꢌꢍꢎꢏꢐꢑꢓꢔꢕꢖꢗꢘꢙꢚꢛꢜꢝꢡꢢꢣꢤꢥꢦꢧꢨꢩꢪꢫꢬꢭꢮꢯꢰꢱꢳꢴꢵꢶꢷꢸꢹꢺꢻꢼꢽꣁꣂꣃ꣄ꣅ꣆꣇꣈꣉꣊꣋꣌꣍꣎꣏꣐꣑꣓꣔꣕꣖꣗꣘꣙꣚꣛꣜꣝꣡꣢꣣꣤꣥꣦꣧꣨꣩꣪꣫꣬꣭꣮꣯꣰꣱ꣳꣴꣵꣶꣷ꣸꣹꣺ꣻ꣼ꣽꥁꥂꥃꥄꥅꥆꥇꥈꥉꥊꥋꥌꥍꥎꥏꥐꥑ꥓꥔꥕꥖꥗꥘꥙꥚꥛꥜꥝ꥡꥢꥣꥤꥥꥦꥧꥨꥩꥪꥫꥬꥭꥮꥯꥰꥱꥳꥴꥵꥶꥷꥸꥹꥺꥻꥼ꥽ꦁꦂꦃꦄꦅꦆꦇꦈꦉꦊꦋꦌꦍꦎꦏꦐꦑꦓꦔꦕꦖꦗꦘꦙꦚꦛꦜꦝꦡꦢꦣꦤꦥꦦꦧꦨꦩꦪꦫꦬꦭꦮꦯꦰꦱ꦳ꦴꦵꦶꦷꦸꦹꦺꦻꦼꦽ꧁꧂꧃꧄꧅꧆꧇꧈꧉꧊꧋꧌꧍꧎ꧏ꧐꧑꧓꧔꧕꧖꧗꧘꧙꧚꧛꧜꧝ꧡꧢꧣꧤꧥꧦꧧꧨꧩꧪꧫꧬꧭꧮꧯ꧰꧱꧳꧴꧵꧶꧷꧸꧹ꧺꧻꧼꧽꩁꩂꩃꩄꩅꩆꩇꩈꩉꩊꩋꩌꩍ꩎꩏꩐꩑꩓꩔꩕꩖꩗꩘꩙꩚꩛꩜꩝ꩡꩢꩣꩤꩥꩦꩧꩨꩩꩪꩫꩬꩭꩮꩯꩰꩱꩳꩴꩵꩶ꩷꩸꩹ꩺꩻꩼꩽꪁꪂꪃꪄꪅꪆꪇꪈꪉꪊꪋꪌꪍꪎꪏꪐꪑꪓꪔꪕꪖꪗꪘꪙꪚꪛꪜꪝꪡꪢꪣꪤꪥꪦꪧꪨꪩꪪꪫꪬꪭꪮꪯꪰꪱꪴꪳꪵꪶꪷꪸꪹꪺꪻꪼꪽ꫁ꫂ꫃꫄꫅꫆꫇꫈꫉꫊꫋꫌꫍꫎꫏꫐꫑꫓꫔꫕꫖꫗꫘꫙꫚ꫛꫜꫝꫡꫢꫣꫤꫥꫦꫧꫨꫩꫪꫫꫬꫭꫮꫯ꫰꫱ꫳꫴꫵ꫶꫷꫸꫹꫺꫻꫼꫽ꭁꭂꭃꭄꭅꭆꭇꭈꭉꭊꭋꭌꭍꭎꭏꭐꭑꭓꭔꭕꭖꭗꭘꭙꭚ꭛ꭜꭝꭡꭢꭣꭤꭥꭦꭧꭨꭩ꭪꭫꭬꭭꭮꭯ꭰꭱꭳꭴꭵꭶꭷꭸꭹꭺꭻꭼꭽꮁꮂꮃꮄꮅꮆꮇꮈꮉꮊꮋꮌꮍꮎꮏꮐꮑꮓꮔꮕꮖꮗꮘꮙꮚꮛꮜꮝꮡꮢꮣꮤꮥꮦꮧꮨꮩꮪꮫꮬꮭꮮꮯꮰꮱꮳꮴꮵꮶꮷꮸꮹꮺꮻꮼꮽ걡걢걣걤걥걦걧걨걩걪걫걬걭걮걯거걱걳건걵걶걷걸걹걺걻걼걽겁겂것겄겅겆겇겈겉겊겋게겍겎겏겐겑겓겔겕겖겗겘겙겚겛겜겝겡겢겣겤겥겦겧겨격겪겫견겭겮겯결겱겳겴겵겶겷겸겹겺겻겼경곁곂곃계곅곆곇곈곉곊곋곌곍곎곏곐곑곓곔곕곖곗곘곙곚곛곜곝곡곢곣곤곥곦곧골곩곪곫곬곭곮곯곰곱곳곴공곶곷곸곹곺곻과곽굁굂굃굄굅굆굇굈굉굊굋굌굍굎굏교굑굓굔굕굖굗굘굙굚굛굜굝굡굢굣굤굥굦굧굨굩굪굫구국굮굯군굱굳굴굵굶굷굸굹굺굻굼굽궁궂궃궄궅궆궇궈궉궊궋권궍궎궏궐궑궓궔궕궖궗궘궙궚궛궜궝궡궢궣궤궥궦궧궨궩궪궫궬궭궮궯궰궱궳궴궵궶궷궸궹궺궻궼궽귁귂귃귄귅귆귇귈귉귊귋귌귍귎귏귐귑귓귔귕귖귗귘귙귚귛규귝귡귢귣귤귥귦귧귨귩귪귫귬귭귮귯귰귱귳귴귵귶귷그극귺귻근귽깁깂깃깄깅깆깇깈깉깊깋까깍깎깏깐깑깓깔깕깖깗깘깙깚깛깜깝깡깢깣깤깥깦깧깨깩깪깫깬깭깮깯깰깱깳깴깵깶깷깸깹깺깻깼깽꺁꺂꺃꺄꺅꺆꺇꺈꺉꺊꺋꺌꺍꺎꺏꺐꺑꺓꺔꺕꺖꺗꺘꺙꺚꺛꺜꺝꺡꺢꺣꺤꺥꺦꺧꺨꺩꺪꺫꺬꺭꺮꺯꺰꺱꺳꺴꺵꺶꺷꺸꺹꺺꺻꺼꺽껁껂껃껄껅껆껇껈껉껊껋껌껍껎껏껐껑껓껔껕껖껗께껙껚껛껜껝껡껢껣껤껥껦껧껨껩껪껫껬껭껮껯껰껱껳껴껵껶껷껸껹껺껻껼껽꽁꽂꽃꽄꽅꽆꽇꽈꽉꽊꽋꽌꽍꽎꽏꽐꽑꽓꽔꽕꽖꽗꽘꽙꽚꽛꽜꽝꽡꽢꽣꽤꽥꽦꽧꽨꽩꽪꽫꽬꽭꽮꽯꽰꽱꽳꽴꽵꽶꽷꽸꽹꽺꽻꽼꽽꾁꾂꾃꾄꾅꾆꾇꾈꾉꾊꾋꾌꾍꾎꾏꾐꾑꾓꾔꾕꾖꾗꾘꾙꾚꾛꾜꾝꾡꾢꾣꾤꾥꾦꾧꾨꾩꾪꾫꾬꾭꾮꾯꾰꾱꾳꾴꾵꾶꾷꾸꾹꾺꾻꾼꾽끡끢끣끤끥끦끧끨끩끪끫끬끭끮끯끰끱끳끴끵끶끷끸끹끺끻끼끽낁낂낃낄낅낆낇낈낉낊낋낌낍낎낏낐낑낓낔낕낖낗나낙낚낛난낝낡낢낣낤낥낦낧남납낪낫났낭낮낯낰낱낳내낵낶낷낸낹낺낻낼낽냁냂냃냄냅냆냇냈냉냊냋냌냍냎냏냐냑냓냔냕냖냗냘냙냚냛냜냝냡냢냣냤냥냦냧냨냩냪냫냬냭냮냯냰냱냳냴냵냶냷냸냹냺냻냼냽녁녂녃년녅녆녇녈녉녊녋녌녍녎녏념녑녓녔녕녖녗녘녙녚녛녜녝녡녢녣녤녥녦녧녨녩녪녫녬녭녮녯녰녱녳녴녵녶녷노녹녺녻논녽놁놂놃놄놅놆놇놈놉놊놋놌농놎놏놐놑놓놔놕놖놗놘놙놚놛놜놝놡놢놣놤놥놦놧놨놩놪놫놬놭놮놯놰놱놳놴놵놶놷놸놹놺놻놼놽뇁뇂뇃뇄뇅뇆뇇뇈뇉뇊뇋뇌뇍뇎뇏뇐뇑뇓뇔뇕뇖뇗뇘뇙뇚뇛뇜뇝뇡뇢뇣뇤뇥뇦뇧뇨뇩뇪뇫뇬뇭뇮뇯뇰뇱뇳뇴뇵뇶뇷뇸뇹뇺뇻뇼뇽뉁뉂뉃뉄뉅뉆뉇뉈뉉뉊뉋뉌뉍뉎뉏뉐뉑뉓뉔뉕뉖뉗뉘뉙뉚뉛뉜뉝뉡뉢뉣뉤뉥뉦뉧뉨뉩뉪뉫뉬뉭뉮뉯뉰뉱뉳뉴뉵뉶뉷뉸뉹뉺뉻뉼뉽늁늂늃늄늅늆늇늈늉늊늋늌늍늎늏느늑늓는늕늖늗늘늙늚늛늜늝늡늢늣늤능늦늧늨늩늪늫늬늭늮늯늰늱늳늴늵늶늷늸늹늺늻늼늽닁닂닃닄닅닆닇니닉닊닋닌닍닎닏닐닑닓닔닕닖닗님닙닚닛닜닝닡닢닣다닥닦닧단닩닪닫달닭닮닯닰닱닳담답닶닷닸당닺닻닼닽덁덂덃덄덅덆덇덈덉덊덋덌덍덎덏덐덑덓더덕덖덗던덙덚덛덜덝덡덢덣덤덥덦덧덨덩덪덫덬덭덮덯데덱덳덴덵덶덷델덹덺덻덼덽뎁뎂뎃뎄뎅뎆뎇뎈뎉뎊뎋뎌뎍뎎뎏뎐뎑뎓뎔뎕뎖뎗뎘뎙뎚뎛뎜뎝뎡뎢뎣뎤뎥뎦뎧뎨뎩뎪뎫뎬뎭뎮뎯뎰뎱뎳뎴뎵뎶뎷뎸뎹뎺뎻뎼뎽둡둢둣둤둥둦둧둨둩둪둫둬둭둮둯둰둱둳둴둵둶둷둸둹둺둻둼둽뒁뒂뒃뒄뒅뒆뒇뒈뒉뒊뒋뒌뒍뒎뒏뒐뒑뒓뒔뒕뒖뒗뒘뒙뒚뒛뒜뒝뒡뒢뒣뒤뒥뒦뒧뒨뒩뒪뒫뒬뒭뒮뒯뒰뒱뒳뒴뒵뒶뒷뒸뒹뒺뒻뒼뒽듁듂듃듄듅듆듇듈듉듊듋듌듍듎듏듐듑듓듔듕듖듗듘듙듚듛드득듡듢듣들듥듦듧듨듩듪듫듬듭듮듯듰등듳듴듵듶듷듸듹듺듻듼듽땁땂땃땄땅땆땇땈땉땊땋때땍땎땏땐땑땓땔땕땖땗땘땙땚땛땜땝땡땢땣땤땥땦땧땨땩땪땫땬땭땮땯땰땱땳땴땵땶땷땸땹땺땻땼땽떁떂떃떄떅떆떇떈떉떊떋떌떍떎떏떐떑떓떔떕떖떗떘떙떚떛떜떝떡떢떣떤떥떦떧떨떩떪떫떬떭떮떯떰떱떳떴떵떶떷떸떹떺떻떼떽뗁뗂뗃뗄뗅뗆뗇뗈뗉뗊뗋뗌뗍뗎뗏뗐뗑뗓뗔뗕뗖뗗뗘뗙뗚뗛뗜뗝뗡뗢뗣뗤뗥뗦뗧뗨뗩뗪뗫뗬뗭뗮뗯뗰뗱뗳뗴뗵뗶뗷뗸뗹뗺뗻뗼뗽뙁뙂뙃뙄뙅뙆뙇뙈뙉뙊뙋뙌뙍뙎뙏뙐뙑뙓뙔뙕뙖뙗뙘뙙뙚뙛뙜뙝뙡뙢뙣뙤뙥뙦뙧뙨뙩뙪뙫뙬뙭뙮뙯뙰뙱뙳뙴뙵뙶뙷뙸뙹뙺뙻뙼뙽뚁뚂뚃뚄뚅뚆뚇뚈뚉뚊뚋뚌뚍뚎뚏뚐뚑뚓뚔뚕뚖뚗뚘뚙뚚뚛뚜뚝뚡뚢뚣뚤뚥뚦뚧뚨뚩뚪뚫뚬뚭뚮뚯뚰뚱뚳뚴뚵뚶뚷뚸뚹뚺뚻뚼뚽뛁뛂뛃뛄뛅뛆뛇뛈뛉뛊뛋뛌뛍뛎뛏뛐뛑뛓뛔뛕뛖뛗뛘뛙뛚뛛뛜뛝뛡뛢뛣뛤뛥뛦뛧뛨뛩뛪뛫뛬뛭뛮뛯뛰뛱뛳뛴뛵뛶뛷뛸뛹뛺뛻뛼뛽띁띂띃띄띅띆띇띈띉띊띋띌띍띎띏띐띑띓띔띕띖띗띘띙띚띛띜띝띡띢띣띤띥띦띧띨띩띪띫띬띭띮띯띰띱띳띴띵띶띷띸띹띺띻라락랁랂랃랄랅랆랇랈랉랊랋람랍랎랏랐랑랓랔랕랖랗래랙랚랛랜랝랡랢랣랤랥랦랧램랩랪랫랬랭랮랯랰랱랳랴략랶랷랸랹랺랻랼랽롡롢롣롤롥롦롧롨롩롪롫롬롭롮롯롰롱롳롴롵롶롷롸롹롺롻롼롽뢁뢂뢃뢄뢅뢆뢇뢈뢉뢊뢋뢌뢍뢎뢏뢐뢑뢓뢔뢕뢖뢗뢘뢙뢚뢛뢜뢝뢡뢢뢣뢤뢥뢦뢧뢨뢩뢪뢫뢬뢭뢮뢯뢰뢱뢳뢴뢵뢶뢷뢸뢹뢺뢻뢼뢽룁룂룃룄룅룆룇룈룉룊룋료룍룎룏룐룑룓룔룕룖룗룘룙룚룛룜룝룡룢룣룤룥룦룧루룩룪룫룬룭룮룯룰룱룳룴룵룶룷룸룹룺룻룼룽륁륂륃륄륅륆륇륈륉륊륋륌륍륎륏륐륑륓륔륕륖륗류륙륚륛륜륝륡륢륣륤륥륦륧륨륩륪륫륬륭륮륯륰륱륳르륵륶륷른륹륺륻를륽릁릂릃름릅릆릇릈릉릊릋릌릍릎릏릐릑릓릔릕릖릗릘릙릚릛릜릝릡릢릣릤릥릦릧릨릩릪릫리릭릮릯린릱릳릴릵릶릷릸릹릺릻림립링맂맃맄맅맆맇마막맊맋만맍많맏말맑맓맔맕맖맗맘맙맚맛맜망맡맢맣매맥맦맧맨맩맪맫맬맭맮맯맰맱맳맴맵맶맷맸맹맺맻맼맽멁멂멃멄멅멆멇멈멉멊멋멌멍멎멏멐멑멓메멕멖멗멘멙멚멛멜멝멡멢멣멤멥멦멧멨멩멪멫멬멭멮멯며멱멳면멵멶멷멸멹멺멻멼멽몁몂몃몄", "", "" };
/*      */ 
/*      */     public Encoder(Charset paramCharset)
/*      */     {
/*   52 */       super(index1, index2);
/*      */     }
/*      */ 
/*      */     public boolean isLegalReplacement(byte[] paramArrayOfByte) {
/*   56 */       return true;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     sun.awt.motif.X11Johab
 * JD-Core Version:    0.6.2
 */