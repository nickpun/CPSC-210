package ca.ubc.cs.cpsc210.resourcefinder.tests;

import ca.ubc.cs.cpsc210.resourcefinder.model.ContactInfo;
import ca.ubc.cs.cpsc210.resourcefinder.model.Resource;
import ca.ubc.cs.cpsc210.resourcefinder.model.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

// unit tests for Resource class
public class ResourceTest {
    private Resource testResource;

    @BeforeEach
    public void runBefore() {
        testResource = new Resource("Family Services", null);
    }

    @Test
    public void testConstructor() {
        String name = "Family Services";
        ContactInfo contactInfo = null;
        assertEquals(name, testResource.getName());
        assertEquals(contactInfo, testResource.getContactInfo());
    }

    @Test
    public void testOffersServiceT() {
        Service service = Service.FOOD;
        testResource.addService(service);
        assertTrue(testResource.offersService(service));
    }

    @Test
    public void testOffersServiceF() {
        Service service = Service.FOOD;
        assertFalse(testResource.offersService(service));
    }

    @Test
    public void testOffersAllT() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        testResource.addService(service1);
        testResource.addService(service2);
        services.add(service1);
        services.add(service2);
        assertTrue(testResource.offersAllServicesInSet(services));
    }

    @Test
    public void testOffersAllF() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        services.add(service1);
        services.add(service2);
        assertFalse(testResource.offersAllServicesInSet(services));
    }

    @Test
    public void testOffersAnyT() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        testResource.addService(service1);
        services.add(service1);
        services.add(service2);
        assertTrue(testResource.offersAnyServicesInSet(services));
    }

    @Test
    public void testOffersAnyF() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        services.add(service1);
        services.add(service2);
        assertFalse(testResource.offersAnyServicesInSet(services));
    }

    @Test
    public void testOffersAllEmpty() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        testResource.addService(service1);
        testResource.addService(service2);
        assertTrue(testResource.offersAllServicesInSet(services));
    }

    @Test
    public void testOffersAnyEmpty() {
        Set<Service> services = new HashSet<>();
        Service service1 = Service.FOOD;
        Service service2 = Service.LEGAL;
        testResource.addService(service1);
        testResource.addService(service2);
        assertFalse(testResource.offersAnyServicesInSet(services));
    }
}