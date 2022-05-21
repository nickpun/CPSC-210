package ca.ubc.cs.cpsc210.resourcefinder.tests;

import ca.ubc.cs.cpsc210.resourcefinder.model.Resource;
import ca.ubc.cs.cpsc210.resourcefinder.model.ResourceRegistry;
import ca.ubc.cs.cpsc210.resourcefinder.model.Service;
import jdk.nashorn.tools.Shell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

// unit tests for ResourceRegistry class
public class ResourceRegistryTest {
    private ResourceRegistry testRegistry;
    private Resource r1;
    private Resource r2;
    private Resource r3;
    private Resource r4;

    @BeforeEach
    public void runBefore() {
        testRegistry = new ResourceRegistry();
        r1 = new Resource("Res 1", null);
        r2 = new Resource("Res 2", null);
        r3 = new Resource("Res 3", null);
        r4 = new Resource("Res 4", null);
    }

    @Test
    public void testConstructor() {
        List<Resource> resources = new ArrayList<>();
        List<Resource> resourceList = Collections.unmodifiableList(resources);
        assertEquals(resourceList, testRegistry.getResources());
    }

    @Test
    public void testOfferingService() {
        loadResources();
        Set<Resource> set = new HashSet<>();
        set.add(r1); set.add(r2); set.add(r4);
        assertEquals(set, testRegistry.getResourcesOfferingService(Service.FOOD));
    }

    @Test
    public void testOfferingAllServiceEmpty() {
        loadResources();
        Set<Resource> set = new HashSet<>();
        set.add(r1); set.add(r2); set.add(r3); set.add(r4);
        Set<Service> requestedServices = new HashSet<>();
        assertEquals(set, testRegistry.getResourcesOfferingAllServicesInSet(requestedServices));
    }

    @Test
    public void testOfferingAllService() {
        loadResources();
        Set<Resource> set = new HashSet<>();
        set.add(r1); set.add(r4);
        Set<Service> requestedServices = new HashSet<>();
        requestedServices.add(Service.FOOD);
        requestedServices.add(Service.SHELTER);
        assertEquals(set, testRegistry.getResourcesOfferingAllServicesInSet(requestedServices));
    }

    @Test
    public void testOfferingAnyServiceEmpty() {
        loadResources();
        Set<Resource> set = new HashSet<>();
        Set<Service> requestedServices = new HashSet<>();
        assertEquals(set, testRegistry.getResourcesOfferingAnyServicesInSet(requestedServices));
    }

    @Test
    public void testOfferingAnyService() {
        loadResources();
        Set<Resource> set = new HashSet<>();
        set.add(r1); set.add(r2); set.add(r3); set.add(r4);
        Set<Service> requestedServices = new HashSet<>();
        requestedServices.add(Service.FOOD);
        requestedServices.add(Service.SHELTER);
        requestedServices.add(Service.YOUTH);
        requestedServices.add(Service.SENIOR);
        requestedServices.add(Service.LEGAL);
        assertEquals(set, testRegistry.getResourcesOfferingAnyServicesInSet(requestedServices));
    }

    // MODIFIES: this
    // EFFECTS:  adds services to resources and resources to registry
    private void loadResources() {
        r1.addService(Service.FOOD);
        r1.addService(Service.SHELTER);
        r2.addService(Service.YOUTH);
        r2.addService(Service.FOOD);
        r3.addService(Service.SENIOR);
        r4.addService(Service.SHELTER);
        r4.addService(Service.FOOD);
        r4.addService(Service.LEGAL);

        testRegistry.addResource(r1);
        testRegistry.addResource(r2);
        testRegistry.addResource(r3);
        testRegistry.addResource(r4);
    }
}