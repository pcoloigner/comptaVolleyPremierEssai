/**
 * Pour cette application, où il y aura relativement peu de classes de domaine,
 * on a choisi de les mettre toutes dans ce package.
 * 
 * Notez que les classes de domaine sont des classes qui représentent des concepts métier.
 * 
 * Nous aurons : 
 * - des entités (classes qui représentent des tables en base de données)
 * - des objets de valeur (classes qui représentent des concepts métier qui ne sont pas des entités)
 * - des agrégats (classes qui représentent des agrégats de classes de domaine)
 * - des services de domaine (classes qui contiennent de la logique métier)
 * - des événements de domaine (classes qui représentent des événements métier)
 * - des spécifications (classes qui représentent des règles métier)
 * - des exceptions métier (classes qui représentent des exceptions métier)
 * - des interfaces de repository (classes qui représentent des interfaces pour accéder aux données)
 * - des classes de mapping (classes qui permettent de mapper des entités avec des DTO)
 * - des DTO (Data Transfer Object) (classes qui permettent de transférer des données entre les couches)
 * - des classes de configuration (classes qui permettent de configurer l'application)
 * - des classes utilitaires (classes qui contiennent des méthodes utilitaires)
 * - des classes de test (classes qui contiennent des tests unitaires)
 * - des classes de contrôle (classes qui contiennent de la logique de contrôle)
 * - des classes de présentation (classes qui contiennent de la logique de présentation)
 * - des classes de persistance (classes qui contiennent de la logique de persistance)
 * - des classes de sécurité (classes qui contiennent de la logique de sécurité)
 * 
 * Pour plus d'informations sur les classes de domaine, vous pouvez consulter le lien suivant : 
 * https://docs.microsoft.com/fr-fr/dotnet/architecture/microservices/microservice-ddd-cqrs-patterns/ddd-oriented-microservice
 * 
 * 
 * Perso : 
 * - Type de mouvement : entrée, sortie ou débit/crédit
 * - Comptes : de dépenses, de recettes : code et libellé
 * - Mouvements : date, type, montant, compte, commentaire
 * - Budgets : année, montant, compte, commentaire
 * - Budgets prévisionnels : année, montant, compte, commentaire
 * - Budgets réalisés : année, montant, compte, commentaire
 * 
 * Je rappelle que cette application doit être utile.
 * Pas la peine de faire des choses trop compliquées.
 * 
 * 
 */
package org.pcomeziantou.comptavolley.domain;
