package com.atom.orchestrator.controller;

import com.atom.orchestrator.config.OrchestratorConfig;
import com.atom.orchestrator.model.OrchestratorServer;
import com.atom.orchestrator.service.ProxySyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author Atom
 */
@RestController
@RequestMapping
public class ProxySyncController {

    @Resource
    private ProxySyncService proxySyncService;

    @Resource
    private OrchestratorConfig orchestratorConfig;

    @GetMapping
    public void proxySync() {
        List<OrchestratorServer> orchestratorServers = orchestratorConfig.getServers();
        Random random = new Random();
        OrchestratorServer orchestratorServer = orchestratorServers.get(random.nextInt(orchestratorServers.size()));
        proxySyncService.proxySync(orchestratorServer,false);
    }
}
