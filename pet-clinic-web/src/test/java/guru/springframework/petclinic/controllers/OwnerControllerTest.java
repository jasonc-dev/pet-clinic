package guru.springframework.petclinic.controllers;

//@ExtendWith(MockitoExtension.class)
//class OwnerControllerTest {
//
//    @Mock OwnerService ownerService;
//    @InjectMocks OwnerController controller;
//    Set<Owner> owners;
//    MockMvc mockMvc;
//
//    @BeforeEach
//    void setUp() {
//        owners = new HashSet<>();
//        owners.add(Owner.builder().id(1l).build());
//        owners.add(Owner.builder().id(2l).build());
//        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//    }
//
////    @Test
////    void listOwners() throws Exception {
////        when(ownerService.findAll()).thenReturn(owners);
////        mockMvc.perform(get("/owners"))
////                .andExpect(status().isOk())
////                .andExpect(view().name("owners/index"))
////                .andExpect(model().attribute("owners", hasSize(2)));
////    }
//
////    @Test
////    void listOwnersByIndex() throws Exception {
////        when(ownerService.findAll()).thenReturn(owners);
////        mockMvc.perform(get("/owners/index"))
////                .andExpect(status().isOk())
////                .andExpect(view().name("owners/index"))
////                .andExpect(model().attribute("owners", hasSize(2)));
////    }
//
//    @Test
//    void findOwners() throws Exception {
//        mockMvc.perform(get("/owners/find"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/findOwners"))
//                .andExpect(model().attributeExists("owner"));
//
//        verifyNoInteractions(ownerService);
//    }
//
//    @Test
//    void processFindFormReturnMany() throws Exception {
//        when(ownerService.findAllByLastNameLike(anyString()))
//                .thenReturn(Arrays.asList(Owner.builder().id(1l).build(),
//                        Owner.builder().id(2l).build()));
//
//        mockMvc.perform(get("/owners"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/ownersList"))
//                .andExpect(model().attribute("selections", hasSize(2)));
//    }
//
//    @Test
//    void processFindFormReturnOne() throws Exception {
//        when(ownerService.findAllByLastNameLike(anyString()))
//                .thenReturn(Arrays.asList(Owner.builder().id(1l).build()));
//
//        mockMvc.perform(get("/owners"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/owners/1"));
//    }
//
//    @Test
//    void displayOwner() throws Exception {
//        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1l).build());
//
//        mockMvc.perform(get("/owners/123"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/ownerDetails"))
//                .andExpect(model().attribute("owner", hasProperty("id", is(1l))));
//    }
//
//    @Test
//    void initCreationForm() throws Exception {
//        mockMvc.perform(get("/owners/new"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/createOrUpdateOwnerForm"))
//                .andExpect(model().attributeExists("owner"));
//        verifyNoInteractions(ownerService);
//    }
//
//    @Test
//    void processCreationForm() throws Exception {
//        when(ownerService.save(any())).thenReturn(Owner.builder().id(1l).build());
//
//        mockMvc.perform(post("/owners/new"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/owners/1"))
//                .andExpect(model().attributeExists("owner"));
//
//        verify(ownerService).save(any());
//    }
//
//    @Test
//    void initUpdateOwnerForm() throws Exception {
//        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1l).build());
//
//        mockMvc.perform(get("/owners/1/edit"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/createOrUpdateOwnerForm"))
//                .andExpect(model().attributeExists("owner"));
//
////        verifyNoInteractions(ownerService);
//    }
//
//    @Test
//    void processUpdateOwnerForm() throws Exception {
//        when(ownerService.save(any())).thenReturn(Owner.builder().id(1l).build());
//
//        mockMvc.perform(post("/owners/1/edit"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/owners/1"))
//                .andExpect(model().attributeExists("owner"));
//
//        verify(ownerService).save(any());
//    }
//}

